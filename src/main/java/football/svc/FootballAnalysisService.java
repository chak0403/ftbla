package football.svc;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import football.dao.ExcelResultRepository;
import football.pojo.ExcelResult;

@Service
public class FootballAnalysisService {

//	@Autowired
//	private FootBallAnaylsisDao faDao;
	
	@Autowired
	private ExcelResultRepository excelResultRepository;

//	public void analysisSmallBig() {
//		// List<String> list = faDao.getSBAllOdds();
//		// for(String str : list){
//		// if(str != "null"){
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
//	}

	public List<ExcelResult> test() {
		return excelResultRepository.findByGameDate(Date.valueOf("2016-05-01"));
	}
}
