package student;

public class Student {
	private String name;
	private double Math_Grade;
	private double English_Grade;
	private double APCS_Grade;
	public Student(String n, double m, double e, double c) {
		name = n;
		Math_Grade = m;
		English_Grade = e;
		APCS_Grade = c;
	}
	public double getGPA() {
		return (Math_Grade+English_Grade+APCS_Grade)/3;
	}
	
}
