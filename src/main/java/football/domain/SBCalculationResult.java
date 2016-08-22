package football.domain;

public class SBCalculationResult {
	private double totalCount;
	private double winCOunt;
	private double percentage;
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getWinCOunt() {
		return winCOunt;
	}
	public void setWinCOunt(double winCOunt) {
		this.winCOunt = winCOunt;
	}
	public double getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(double totalCount) {
		this.totalCount = totalCount;
	}
}
