package point;

public class Point {
	private double XCoord;
	private double YCoord;
	public Point(double x,double y) {
		XCoord = x;
		YCoord = y;
	}
	public void rotate(double angle) {
		double currentAngle = Math.atan(YCoord/XCoord);
		double newAngle = ((currentAngle+((angle*Math.PI)/180))%(2*Math.PI));
		double hyp = Math.sqrt(XCoord*XCoord+YCoord*YCoord);
		XCoord = hyp*Math.cos(newAngle);
		YCoord = hyp*Math.sin(newAngle);
	}
	public double getX() {
		return XCoord;
	}
}
