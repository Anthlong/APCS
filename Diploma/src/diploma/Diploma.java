package diploma;

public class Diploma {
	private String name;
	private String subject;
	public Diploma(String n, String s) {
		name =n;
		subject=  s;
	}
	@Override public String toString() {
		return "This certifies that "+name+"\nhas completed a course in "+subject;
	}
}
