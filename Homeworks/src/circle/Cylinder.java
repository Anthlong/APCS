package circle;

public class Cylinder {
	private static Circle base;
	private static double height;
	public Cylinder(double r, double h) {
		height = h;
		base = new Circle(r);
	}
	public static double getVolume() {
		return base.getArea()*height;
	}
}
