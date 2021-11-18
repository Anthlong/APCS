package circle;

import java.util.Scanner;
public class CylinderTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the base of your cylinder?");
		double y = input.nextDouble();
		System.out.println("What is the height of your cylinder?");
		double h = input.nextDouble();
		Cylinder x = new Cylinder(y,h);
		input.close();
		System.out.println("The volume of your cylinder is "+x.getVolume());
	}
}
