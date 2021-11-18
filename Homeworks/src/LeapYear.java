import java.util.Scanner;
public class LeapYear {
	public static boolean calcLeapYear(int x) {
		if (x%4 == 0) {
			if (x%100==0) {
				if (x%400==0) {
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What year would you like to check?");
		int year = input.nextInt();
		input.close();
		if (calcLeapYear(year)) {
			System.out.println(""+year+" is a leap year.");
		} else {
			System.out.println(""+year+" is not a leap year.");
		}
	}
}
