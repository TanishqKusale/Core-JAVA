package code;

public enum ServicePlan {
	
	SILVER(1000),
	GOLD(2000),
	DIAMOND(5000),
	PLATINUM(10000);
	
	private double regAmt;
	
	ServicePlan(double regAmt){
		this.regAmt=regAmt;
	}

	public double getRegAmt() {
		return regAmt;
	}

	
	
	

}
