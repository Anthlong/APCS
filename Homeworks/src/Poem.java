import java.util.Scanner;
public class Poem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pick rock, paper or scissors (R,P,S):");
		String rps = input.nextLine();
		int x = (int)(Math.random()*3);
		String robot;
		switch (x) {
		case 0:
			robot = "R";
			break;
		case 1:
			robot = "P"; 
			break;
		case 2:
			robot = "S";
			break;
		default:
			robot = "R";
		} 
		switch (rps) {
		case "R":
			if (rps == robot) {
				System.out.println("Tied!");
			} else if (robot=="P") {
				System.out.println("You Lost!");
			} else if (robot=="S") {
				System.out.println("You Won!");
			}
			break;
		case "P":
			if (rps == robot) {
				System.out.println("Tied!");
			} else if (robot=="S") {
				System.out.println("You Lost!");
			} else if (robot=="R") {
				System.out.println("You Won!");
			}
			break;
		case "S":
			if (rps == robot) {
				System.out.println("Tied!");
			} else if (robot=="R") {
				System.out.println("You Lost!");
			} else if (robot=="P") {
				System.out.println("You Won!");
			}
			break;
		default:
			System.out.println("");
			break;
		}
		input.close();
	}
}
