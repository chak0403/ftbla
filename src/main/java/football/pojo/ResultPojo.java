package football.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "excelresult")
public class ResultPojo implements Serializable{
	
	@Id
	@Column(name="gameId")
	private Integer gameId;

	@Column(name="gameDay")
	private String gameDay;

	@Column(name="gameNo")
	private Integer gameNo;

	@Column(name="home")
	private String home;

	@Column(name="away")
	private String away;

	@Column(name="gameType")
	private String gameType;

	@Column(name="gameTime")
	private String gameTime;

	@Column(name="gameDate")
	private Date gameDate;

	@Column(name="halfHomeResult")
	private Integer halfHomeResult;

	@Column(name="halfAwayResult")
	private Integer halfAwayResult;

	@Column(name="fullHomeResult")
	private Integer fullHomeResult;

	@Column(name="fullAwayResult")
	private Integer fullAwayResult;

	@Column(name="HADHome")
	private Double HADHome;

	@Column(name="HADDraw")
	private Double HADDraw;

	@Column(name="HADAway")
	private Double HADAway;

	@Column(name="fullSBOdd")
	private String fullSBOdd;

	@Column(name="fullSBSmall")
	private Double fullSBSmall;

	@Column(name="fullSBBig")
	private Double fullSBBig;

	@Column(name="halfFullHH")
	private Double halfFullHH;

	@Column(name="halfFullHD")
	private Double halfFullHD;

	@Column(name="halfFullHA")
	private Double halfFullHA;

	@Column(name="halfFullDH")
	private Double halfFullDH;

	@Column(name="halfFullDD")
	private Double halfFullDD;

	@Column(name="halfFullDA")
	private Double halfFullDA;

	@Column(name="halfFullAH")
	private Double halfFullAH;

	@Column(name="halfFullAD")
	private Double halfFullAD;

	@Column(name="halfFullAA")
	private Double halfFullAA;

	@Column(name="halfHADHome")
	private Double halfHADHome;

	@Column(name="halfHADDraw")
	private Double halfHADDraw;

	@Column(name="halfHADAway")
	private Double halfHADAway;

	@Column(name="halfSBOdd")
	private String halfSBOdd;

	@Column(name="halfSBSmall")
	private Double halfSBSmall;

	@Column(name="halfSBBig")
	private Double halfSBBig;

	@Column(name="firstGoalHome")
	private Double firstGoalHome;

	@Column(name="firstGoalNone")
	private Double firstGoalNone;

	@Column(name="firstGoalAway")
	private Double firstGoalAway;

	@Column(name="conerOdd")
	private String conerOdd;

	@Column(name="conerBig")
	private Double conerBig;

	@Column(name="conerSmall")
	private Double conerSmall;

	@Column(name="handicapOdd")
	private String handicapOdd;

	@Column(name="handicapHome")
	private Double handicapHome;

	@Column(name="handicapAway")
	private Double handicapAway;

	@Column(name="handHADHome")
	private Double handHADHome;

	@Column(name="handHADDraw")
	private Double handHADDraw;

	@Column(name="handHADAway")
	private Double handHADAway;

	@Column(name="teamWin")
	private String teamWin;

	@Column(name="halfTeamWin")
	private String halfTeamWin;

	@Column(name="halfFullResult")
	private String halfFullResult;

	@Column(name="totalGoalResult")
	private String totalGoalResult;

	@Column(name="oddEvenResult")
	private String oddEvenResult;

	@Column(name="conerResult")
	private Integer conerResult;

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public String getGameDay() {
		return gameDay;
	}

	public void setGameDay(String gameDay) {
		this.gameDay = gameDay;
	}

	public Integer getGameNo() {
		return gameNo;
	}

	public void setGameNo(Integer gameNo) {
		this.gameNo = gameNo;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getGameTime() {
		return gameTime;
	}

	public void setGameTime(String gameTime) {
		this.gameTime = gameTime;
	}

	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public Integer getHalfHomeResult() {
		return halfHomeResult;
	}

	public void setHalfHomeResult(Integer halfHomeResult) {
		this.halfHomeResult = halfHomeResult;
	}

	public Integer getHalfAwayResult() {
		return halfAwayResult;
	}

	public void setHalfAwayResult(Integer halfAwayResult) {
		this.halfAwayResult = halfAwayResult;
	}

	public Integer getFullHomeResult() {
		return fullHomeResult;
	}

	public void setFullHomeResult(Integer fullHomeResult) {
		this.fullHomeResult = fullHomeResult;
	}

	public Integer getFullAwayResult() {
		return fullAwayResult;
	}

	public void setFullAwayResult(Integer fullAwayResult) {
		this.fullAwayResult = fullAwayResult;
	}

	public Double getHADHome() {
		return HADHome;
	}

	public void setHADHome(Double hADHome) {
		HADHome = hADHome;
	}

	public Double getHADDraw() {
		return HADDraw;
	}

	public void setHADDraw(Double hADDraw) {
		HADDraw = hADDraw;
	}

	public Double getHADAway() {
		return HADAway;
	}

	public void setHADAway(Double hADAway) {
		HADAway = hADAway;
	}

	public String getFullSBOdd() {
		return fullSBOdd;
	}

	public void setFullSBOdd(String fullSBOdd) {
		this.fullSBOdd = fullSBOdd;
	}

	public Double getFullSBSmall() {
		return fullSBSmall;
	}

	public void setFullSBSmall(Double fullSBSmall) {
		this.fullSBSmall = fullSBSmall;
	}

	public Double getFullSBBig() {
		return fullSBBig;
	}

	public void setFullSBBig(Double fullSBBig) {
		this.fullSBBig = fullSBBig;
	}

	public Double getHalfFullHH() {
		return halfFullHH;
	}

	public void setHalfFullHH(Double halfFullHH) {
		this.halfFullHH = halfFullHH;
	}

	public Double getHalfFullHD() {
		return halfFullHD;
	}

	public void setHalfFullHD(Double halfFullHD) {
		this.halfFullHD = halfFullHD;
	}

	public Double getHalfFullHA() {
		return halfFullHA;
	}

	public void setHalfFullHA(Double halfFullHA) {
		this.halfFullHA = halfFullHA;
	}

	public Double getHalfFullDH() {
		return halfFullDH;
	}

	public void setHalfFullDH(Double halfFullDH) {
		this.halfFullDH = halfFullDH;
	}

	public Double getHalfFullDD() {
		return halfFullDD;
	}

	public void setHalfFullDD(Double halfFullDD) {
		this.halfFullDD = halfFullDD;
	}

	public Double getHalfFullDA() {
		return halfFullDA;
	}

	public void setHalfFullDA(Double halfFullDA) {
		this.halfFullDA = halfFullDA;
	}

	public Double getHalfFullAH() {
		return halfFullAH;
	}

	public void setHalfFullAH(Double halfFullAH) {
		this.halfFullAH = halfFullAH;
	}

	public Double getHalfFullAD() {
		return halfFullAD;
	}

	public void setHalfFullAD(Double halfFullAD) {
		this.halfFullAD = halfFullAD;
	}

	public Double getHalfFullAA() {
		return halfFullAA;
	}

	public void setHalfFullAA(Double halfFullAA) {
		this.halfFullAA = halfFullAA;
	}

	public Double getHalfHADHome() {
		return halfHADHome;
	}

	public void setHalfHADHome(Double halfHADHome) {
		this.halfHADHome = halfHADHome;
	}

	public Double getHalfHADDraw() {
		return halfHADDraw;
	}

	public void setHalfHADDraw(Double halfHADDraw) {
		this.halfHADDraw = halfHADDraw;
	}

	public Double getHalfHADAway() {
		return halfHADAway;
	}

	public void setHalfHADAway(Double halfHADAway) {
		this.halfHADAway = halfHADAway;
	}

	public String getHalfSBOdd() {
		return halfSBOdd;
	}

	public void setHalfSBOdd(String halfSBOdd) {
		this.halfSBOdd = halfSBOdd;
	}

	public Double getHalfSBSmall() {
		return halfSBSmall;
	}

	public void setHalfSBSmall(Double halfSBSmall) {
		this.halfSBSmall = halfSBSmall;
	}

	public Double getHalfSBBig() {
		return halfSBBig;
	}

	public void setHalfSBBig(Double halfSBBig) {
		this.halfSBBig = halfSBBig;
	}

	public Double getFirstGoalHome() {
		return firstGoalHome;
	}

	public void setFirstGoalHome(Double firstGoalHome) {
		this.firstGoalHome = firstGoalHome;
	}

	public Double getFirstGoalNone() {
		return firstGoalNone;
	}

	public void setFirstGoalNone(Double firstGoalNone) {
		this.firstGoalNone = firstGoalNone;
	}

	public Double getFirstGoalAway() {
		return firstGoalAway;
	}

	public void setFirstGoalAway(Double firstGoalAway) {
		this.firstGoalAway = firstGoalAway;
	}

	public String getConerOdd() {
		return conerOdd;
	}

	public void setConerOdd(String conerOdd) {
		this.conerOdd = conerOdd;
	}

	public Double getConerBig() {
		return conerBig;
	}

	public void setConerBig(Double conerBig) {
		this.conerBig = conerBig;
	}

	public Double getConerSmall() {
		return conerSmall;
	}

	public void setConerSmall(Double conerSmall) {
		this.conerSmall = conerSmall;
	}

	public String getHandicapOdd() {
		return handicapOdd;
	}

	public void setHandicapOdd(String handicapOdd) {
		this.handicapOdd = handicapOdd;
	}

	public Double getHandicapHome() {
		return handicapHome;
	}

	public void setHandicapHome(Double handicapHome) {
		this.handicapHome = handicapHome;
	}

	public Double getHandicapAway() {
		return handicapAway;
	}

	public void setHandicapAway(Double handicapAway) {
		this.handicapAway = handicapAway;
	}

	public Double getHandHADHome() {
		return handHADHome;
	}

	public void setHandHADHome(Double handHADHome) {
		this.handHADHome = handHADHome;
	}

	public Double getHandHADDraw() {
		return handHADDraw;
	}

	public void setHandHADDraw(Double handHADDraw) {
		this.handHADDraw = handHADDraw;
	}

	public Double getHandHADAway() {
		return handHADAway;
	}

	public void setHandHADAway(Double handHADAway) {
		this.handHADAway = handHADAway;
	}

	public String getTeamWin() {
		return teamWin;
	}

	public void setTeamWin(String teamWin) {
		this.teamWin = teamWin;
	}

	public String getHalfTeamWin() {
		return halfTeamWin;
	}

	public void setHalfTeamWin(String halfTeamWin) {
		this.halfTeamWin = halfTeamWin;
	}

	public String getHalfFullResult() {
		return halfFullResult;
	}

	public void setHalfFullResult(String halfFullResult) {
		this.halfFullResult = halfFullResult;
	}

	public String getTotalGoalResult() {
		return totalGoalResult;
	}

	public void setTotalGoalResult(String totalGoalResult) {
		this.totalGoalResult = totalGoalResult;
	}

	public String getOddEvenResult() {
		return oddEvenResult;
	}

	public void setOddEvenResult(String oddEvenResult) {
		this.oddEvenResult = oddEvenResult;
	}

	public Integer getConerResult() {
		return conerResult;
	}

	public void setConerResult(Integer conerResult) {
		this.conerResult = conerResult;
	}

	
	
}
