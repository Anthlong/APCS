import java.util.Scanner;
public class SquareTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your square side length?");
		double rad = sc.nextDouble();
		sc.close();
		Square s = new Square(rad);
		System.out.println("Your square is "+s.getArea()+" square units.");
	}
}
