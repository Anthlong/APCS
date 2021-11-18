package ta;
import java.util.Scanner;
public class PayTest {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("What is your name?");
	String n = in.nextLine();
	System.out.println("What is your hourly wage?");
	double r = in.nextDouble();
	System.out.println("What is your hours worked?");
	int h = in.nextInt();
	in.close();
	TA pay = new TA(n,r,h);
	System.out.println("Your hourly wage is "+pay.getPay());
	}
}
