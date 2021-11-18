package student;
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = sc.nextLine();
		System.out.print("What is your math grade?");
		double math = sc.nextDouble();
		System.out.print("What is your english grade?");
		double english = sc.nextDouble();
		System.out.print("What is your APCS grade?");
		double apcs = sc.nextDouble();
		sc.close();
		Student me = new Student(name,math,english,apcs);
		System.out.println("Your GPA is "+me.getGPA());
	}
}
