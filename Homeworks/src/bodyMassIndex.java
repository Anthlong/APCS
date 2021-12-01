import java.util.Scanner;
public class bodyMassIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your weight in pounds:\n");
		double weight = input.nextDouble()*0.454;
		System.out.println("Input your height in inches:\n");
		double height = input.nextDouble()*0.0254;
		input.close();
		System.out.println("Your BMI is:"+(weight/(height*height)));
	}
}
