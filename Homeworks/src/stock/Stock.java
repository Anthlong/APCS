package stock;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock(String sym, String nam, double prev, double current) {
		symbol = sym;
		name = nam;
		previousClosingPrice = prev;
		currentPrice = current;
	}
	public double getPercentage() {
		return 100-100*(currentPrice/previousClosingPrice);
	}
}
