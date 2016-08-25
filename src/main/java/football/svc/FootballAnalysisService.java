package football.svc;

import java.sql.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import football.dao.ExcelResultRepository;
import football.pojo.ExcelResult;
import football.util.PageUtil;
import football.vo.AnalysisVO;
import football.vo.AnalysisResultVO;

@Service
public class FootballAnalysisService {

	private Logger logger = Logger.getLogger(FootballAnalysisService.class);
//	@Autowired
//	private FootBallAnaylsisDao faDao;
	
	@Autowired
	private ExcelResultRepository excelResultDao;

	public void analysisSmallBig() {
		// List<String> list = faDao.getSBAllOdds();
		// for(String str : list){
		// if(str != "null"){
//		List<ExcelResult> recordList = faDao.getSBOddsRecord("[2.5]");
//		List<BigDecimal> rateList = faDao.getAllBigOddRateList("[2.5]");
//		Collections.sort(rateList, Collections.reverseOrder());
//		int bigCount = 0;
//		int smallCount = 0;
//		Map<BigDecimal, SBCalculationResult> resultMap = new HashMap<BigDecimal, SBCalculationResult>();
//		for (BigDecimal rate : rateList) {
//			List<ExcelResult> resultList = faDao.getBigOddRateResultList(rate);
//			double totalCount = 0.0;
//			double bigWinCount = 0.0;
//			for (ExcelResult result : resultList) {
//				String totalGoal = result.getTotalGoalResult();
//
//				if (totalGoal != null && (StrUtil.isNumeric(totalGoal) || totalGoal.equals("7+"))) {
//					totalCount += 1;
//					if (totalGoal.equals("7+")) {
//						bigWinCount += 1;
//					} else if (Integer.valueOf(totalGoal) > 2.5) {
//						bigWinCount += 1;
//					}
//				}
//			}
//			double percentage = 0;
//			// System.out.println("bigWinCount = ["+bigWinCount+"]");
//			// System.out.println("totalCount = ["+totalCount+"]");
//			// System.out.println("percentage = ["+bigWinCount/totalCount+"]");
//			if (totalCount > 0) {
//				percentage = bigWinCount / totalCount;
//			} else {
//				percentage = 0;
//			}
//			SBCalculationResult result = new SBCalculationResult();
//			result.setTotalCount(totalCount);
//			result.setWinCOunt(bigWinCount);
//			result.setPercentage(percentage);
//			resultMap.put(rate, result);
//		}
//
//		Set<BigDecimal> keySet = resultMap.keySet();
//
//		TreeSet<BigDecimal> treeSet = new TreeSet<BigDecimal>();
//		for (BigDecimal rate : keySet) {
//			treeSet.add(rate);
//		}
//		for (BigDecimal rate : treeSet) {
//			SBCalculationResult result = resultMap.get(rate);
//			if (Math.round((((rate.doubleValue() * result.getPercentage())) - 1) * 100) > 0
//					&& result.getTotalCount() >= 29) {
//				System.out.println("[RATE] = " + rate + ", [win%] = "
//						+ Math.round(result.getPercentage() * 10 * 100) / 10 + "%, [totalCount] = "
//						+ result.getTotalCount() + ", [winCount] = " + result.getWinCOunt() + "[Final Result] = "
//						+ Math.round((((rate.doubleValue() * result.getPercentage())) - 1) * 100) + "%");
//			}
//		}
//		// for(ResultPojo record : recordList){
//		// record.getHalfSBBig();
//		// record.getHalfSBSmall();
//		// String totalGoal = record.getTotalGoalResult();
//		// if(totalGoal != "null" && StrUtil.isNumeric(totalGoal)){
//		// int intTotalGoal = Integer.valueOf(totalGoal);
//		// if(intTotalGoal > 2.5){
//		// bigCount++;
//		// }else{
//		// smallCount++;
//		// }
//		// }
//
//		// }
//		// System.out.print("big : " + bigCount + " small : "+ smallCount);
//		// }
//		// }
	}

	public List<ExcelResult> test() {
		return excelResultDao.findByGameDate(Date.valueOf("2016-05-01"));
	}
	
	public AnalysisResultVO analysis(){
		AnalysisResultVO result = new AnalysisResultVO();


		List<ExcelResult> awaySixAwayRsList = excelResultDao.findByAwayOrderByGameIdDesc("阿仙奴", PageUtil.FIRST_SIX);
		List<ExcelResult> awaySixRsList = excelResultDao.findByHomeOrAwayOrderByGameIdDesc("阿仙奴", "阿仙奴", PageUtil.FIRST_SIX);
		List<ExcelResult> awayTenAwayRsList = excelResultDao.findByAwayOrderByGameIdDesc("阿仙奴", PageUtil.FIRST_TEN);
		List<ExcelResult> awayTenRsList = excelResultDao.findByHomeOrAwayOrderByGameIdDesc("阿仙奴", "阿仙奴", PageUtil.FIRST_TEN);
		
		List<ExcelResult> homeSixHomeRsList = excelResultDao.findByHomeOrderByGameIdDesc("曼聯", PageUtil.FIRST_SIX);
		List<ExcelResult> homeSixRsList = excelResultDao.findByHomeOrAwayOrderByGameIdDesc("曼聯", "曼聯", PageUtil.FIRST_SIX);
		List<ExcelResult> homeTenHomeRsList = excelResultDao.findByHomeOrderByGameIdDesc("曼聯", PageUtil.FIRST_TEN);
		List<ExcelResult> homeTenRsList = excelResultDao.findByHomeOrAwayOrderByGameIdDesc("曼聯", "曼聯", PageUtil.FIRST_TEN);
		
		//Analysis
		result.setAwaySixAwayRs(analysisResult( awaySixAwayRsList, "阿仙奴"));
		result.setAwaySixRs(analysisResult( awaySixRsList, "阿仙奴"));
		result.setAwayTenAwayRs(analysisResult(awayTenAwayRsList, "阿仙奴"));
		result.setAwayTenRs(analysisResult(awayTenRsList, "阿仙奴"));
		result.setHomeSixHomeRs(analysisResult(homeSixHomeRsList,  "曼聯"));
		result.setHomeSixRs(analysisResult(homeSixRsList, "曼聯"));
		result.setHomeTenHomeRs(analysisResult(homeTenHomeRsList, "曼聯"));
		result.setHomeTenRs(analysisResult(homeTenRsList, "曼聯"));
		
		return result;
	}
	
	private AnalysisVO analysisResult(List<ExcelResult> rsList, String team){
		String winPer = "";
		String avgAgainst = "";
		String avgFor = "";
		String avgForAgainst = "";
		String goalAgainst = "";
		String goalFor = "";
		String result = "";
		String winDrawLose = "";
		AnalysisVO vo = new AnalysisVO();

		int winCnt=0;
		int loseCnt=0;
		int drawCnt=0;
		double goalForCnt=0;
		double goalAgainstCnt=0;
		double gameCnt=0;
		
		if(rsList.size() == 0){
			return vo;
		}
		for(ExcelResult rs : rsList){
			boolean isHome = isHomeTeam(team, rs.getHome());
			if(isHome){
				if(rs.getFullHomeResult() > rs.getFullAwayResult()){
					result += "W";
					winCnt++;
				}else if(rs.getFullHomeResult() < rs.getFullAwayResult()){
					result += "L";
					loseCnt++;
				}else{
					result += "D";
					drawCnt++;
				}
				goalForCnt +=rs.getFullHomeResult();
				goalAgainstCnt += rs.getFullAwayResult();
			}else{
				if(rs.getFullHomeResult() > rs.getFullAwayResult()){
					result += "L";
					loseCnt++;
				}else if(rs.getFullHomeResult() < rs.getFullAwayResult()){
					result += "W";
					winCnt++;
				}else{
					result += "D";
					drawCnt++;
				}
				goalForCnt += rs.getFullAwayResult();
				goalAgainstCnt += rs.getFullHomeResult();
			}
			gameCnt++;
		}
		logger.info("winCnt="+winCnt+"loseCnt="+loseCnt+"drawCnt="+drawCnt+"goalForCnt="+goalForCnt+"foalAgainst="+goalAgainstCnt+"gameCnt="+gameCnt);
		winPer = (Math.round(((winCnt * 100)/(gameCnt))*100)/100) + "%";
		winDrawLose = "W:" + winCnt + " D:" + drawCnt + " L:" + loseCnt;
		goalFor = "入球:" + goalForCnt;
		goalAgainst = "失球:" + goalAgainstCnt;
		avgAgainst = "失球:" + (((goalAgainstCnt*100) / gameCnt)/100);
		avgFor = "入球:" + (((goalForCnt*100) / gameCnt)/100);
		avgForAgainst = "總入球:" + ((((goalForCnt + goalAgainstCnt)*100)/gameCnt)/100);
		
		vo.setAvgAgainst(avgAgainst);//done
		vo.setAvgFor(avgFor);//done
		vo.setAvgForAgainst(avgForAgainst);//done
		vo.setGoalAgainst(goalAgainst);//done
		vo.setGoalFor(goalFor);//done
		vo.setResult(result);//done
		vo.setWinDrawLose(winDrawLose);//done
		vo.setWinPer(winPer);//done
		return vo;
	}
	
	private boolean isHomeTeam(String team, String rsHome){
		if(rsHome.equals(team)){
			return true;
		}else{
			return false;
		}
	}
}
