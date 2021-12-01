package stock;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock(String s,String n,double p, double c) {
		symbol = s;
		name = n;
		previousClosingPrice = p;
		currentPrice = c;
	}
	public double getPercentage() {
		return 100*(currentPrice/previousClosingPrice)-100;
	}
}
