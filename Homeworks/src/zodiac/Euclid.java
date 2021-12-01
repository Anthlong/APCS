package zodiac;
import java.util.Scanner;
public class Euclid {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("What is your dividend?");
		int dividend = inp.nextInt();
		System.out.println("What is your divisor?");
		int divisor = inp.nextInt();
		inp.close();
		int modulo=1;
		while (modulo!=0) {
			modulo = dividend%divisor;
			dividend = divisor;
			divisor = modulo;
		}
		System.out.println(dividend);
	}
}
