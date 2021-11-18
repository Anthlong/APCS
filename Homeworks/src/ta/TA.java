package ta;

public class TA {
	private String name;
	private double hourlyRate;
	private int hoursWorked;
	public TA(String n, double r, int h) {
		name = n;
		hourlyRate = r;
		hoursWorked = h;
	}
	public double getPay() {
		return hourlyRate*hoursWorked;
	}
}
