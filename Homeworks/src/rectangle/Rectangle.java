package rectangle;

public class Rectangle {
	private double width;
	private double length;
	public Rectangle(double w,double l) {
		width = w;
		length = l;
	}
	public Rectangle() {
		width = 1;
		length = 1;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return width*2+length*2;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
