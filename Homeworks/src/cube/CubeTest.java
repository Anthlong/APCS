package cube;
import java.util.Scanner;
public class CubeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the side length of your cube?");
		double y = input.nextDouble();
		Cube x = new Cube(y);
		input.close();
		System.out.println("The surface area of your cube is "+x.getSurfaceArea() +" and the volume of your cube is "+ x.getVolume());
	}
}