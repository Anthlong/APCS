package point;
import java.util.Scanner;
public class PointTest {
	public static void main(String[] args) {
		System.out.println("This program is vulnerable to floating point error. Here is an example: \n"+(Math.pow(Math.E,Math.PI)-Math.PI)+"\nTherefore, your answer may not be fully accurate.");
		Scanner in = new Scanner(System.in);
		System.out.println("What is your initial x coordinate?");
		double x = in.nextDouble();
		System.out.println("What is your initial y coordinate?");
		double y = in.nextDouble();
		System.out.println("How many degrees would you like to rotate your point?");
		double deg = in.nextDouble();
		in.close();
		Point b = new Point(x,y);
		b.rotate(deg);
		System.out.println("Your new x-coordinate is "+b.getX());
	}
}
