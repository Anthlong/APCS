package stock;

public class StockTest {
	public static void main(String[] args) {
		Stock oracle = new Stock("ORCL","Oracle Corporation",34.5,34.35);
		System.out.println(oracle.getPercentage());
		
	}
}
