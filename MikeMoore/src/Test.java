
public class Test {
	
	static public void main(String a[]){
		
		TimeWorked timeWorked = new TimeWorked(12,9);
		ProfitShare ps = new ProfitShare(1846,timeWorked);
		timeWorked.setProfitShare(ps);
		
		System.out.println("hours worked: " + timeWorked.getHours());
		System.out.println("you pay is: $" + timeWorked.getPay());
		System.out.println("profits are: $" + timeWorked.getProfitShare());
		System.out.println("total for the day: $" + (timeWorked.getPay()+timeWorked.getProfitShare()));
	}
}
