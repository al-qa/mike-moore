
public class ProfitShare {
	private int routeTotal;
	private TimeWorked timeWorked;
	
	public ProfitShare(int routeTotal, TimeWorked timeWorked){
		this.routeTotal = routeTotal;
		this.timeWorked = timeWorked;
	}
	
	public int getProfit(){
		
		if(routeTotal >= 1000 && routeTotal <= 1200)
			return timeWorked.getHours() > 8 ? 10 : 14;
		else if(routeTotal >= 1201 && routeTotal <= 1500)
			return timeWorked.getHours() > 8 ? 14 : 17;
		else if(routeTotal >= 1501 && routeTotal <= 1799)
			return timeWorked.getHours() > 8 ? 17 : 26;
		else if(routeTotal >= 1800 && routeTotal <= 1999)
			return timeWorked.getHours() > 8 ? 26 : 40;
		else if(routeTotal >= 2000)
			return 60;
		else
			return 0;
	}
}
