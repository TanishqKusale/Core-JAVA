package code;

public enum Plan {

	MONTHLY(3000),
	QUARTERLY(11700),
	HALFYEAR(17500),
	YEARLY(32000);
	
	private double price;
	
	private Plan(double price) {
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
