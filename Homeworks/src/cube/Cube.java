package cube;

public class Cube {
	private static double sideLength;
	public Cube(double sl) {
		sideLength = sl;
	}
	public double getVolume() {
		return sideLength*sideLength*sideLength;
	}
	public double getSurfaceArea() {
		return 6*sideLength*sideLength;
	}
}
