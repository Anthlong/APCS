package circle;

public class Circle {
	private double radius;
	public Circle(double rad) {
		radius = rad;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
