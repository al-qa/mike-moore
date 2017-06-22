
public class TimeWorked {
	
	private int hourlyPay;
	private int hoursWorked;
	private ProfitShare profitShare;
	
	public TimeWorked(int hourlyPay, int hoursWorked){
		
		this.hourlyPay = hourlyPay;
		this.hoursWorked = hoursWorked;
	}
	public int getPay(){
		return hourlyPay * hoursWorked;
	}
	public int getHours(){
		return hoursWorked;
	}
	public void setProfitShare(ProfitShare profitShare){
		this.profitShare = profitShare;
	}
	public int getProfitShare(){
		return profitShare.getProfit();
	}
}
