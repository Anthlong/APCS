package sphereCalc;
import java.util.Scanner;
public class SphereCalc {
	public SphereCalc() {
	}
	public double calculateVolume(double radius) {
		return (4.0/3.0)*Math.PI*radius*radius*radius;
	}
	public double calculateSurfaceArea(double radius) {
		return 4*Math.PI*radius*radius;
	}
	public static void main(String[] args) {
		SphereCalc sphere = new SphereCalc();
		Scanner input = new Scanner(System.in);
		System.out.println("Input your sphere's radius (double):");
		double radius = input.nextDouble();
		input.close();
		double volume = sphere.calculateVolume(radius);
		double surfaceArea = sphere.calculateSurfaceArea(radius);
		System.out.println("Properties of your sphere:\nThe volume is "+volume+"\nThe surface area is: "+surfaceArea);
	}
}
