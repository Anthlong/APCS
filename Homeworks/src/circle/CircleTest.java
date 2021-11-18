package circle;
import java.util.Scanner;
public class CircleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of your circle?");
		double y = input.nextDouble();
		Circle x = new Circle(y);
		input.close();
		System.out.println("The area of your circle is "+x.getArea());
	}
}
