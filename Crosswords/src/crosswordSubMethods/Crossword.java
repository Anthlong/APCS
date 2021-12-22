package crosswordSubMethods;
import java.util.Scanner;
public class Crossword {
	private String[][][] grid;
	private String[][] wordHintArr;
	public Scanner in;
	public Crossword(Scanner input) {
		in = input;
		System.out.println("How many words would you like to input?");
		int y = in.nextInt();
		wordHintArr = new String[y][2];
		String[] suffix = {"st","nd","rd","th"};
		for (int i=0;i<wordHintArr.length;i++) {
			if ((i>10)&&(i<20)) {
				System.out.println("Enter your "+(i+1)+suffix[3]+" word:");
				wordHintArr[i][0] = in.nextLine();
				System.out.println("Enter your hint for this word:");
				wordHintArr[i][1] = in.nextLine();
			} else {
			if (i%10==0) {
				System.out.println("Enter your "+(i+1)+suffix[0]+" word:");
				wordHintArr[i][0] = in.nextLine();
				System.out.println("Enter your hint for this word:");
				wordHintArr[i][1] = in.nextLine();
			}
			if (i%10==1) {
				System.out.println("Enter your "+(i+1)+suffix[1]+" word:");
				wordHintArr[i][0] = in.nextLine();
				System.out.println("Enter your hint for this word:");
				wordHintArr[i][1] = in.nextLine();
			}
			if (i%10==2) {
				System.out.println("Enter your "+(i+1)+suffix[2]+" word:");
				wordHintArr[i][0] = in.nextLine();
				System.out.println("Enter your hint for this word:");
				wordHintArr[i][1] = in.nextLine();
			}
			if (i%10>2) {
				System.out.println("Enter your "+(i+1)+suffix[3]+" word:");
				wordHintArr[i][0] = in.nextLine();
				System.out.println("Enter your hint for this word:");
				wordHintArr[i][1] = in.nextLine();
			}
		}
		}
		int x = 0;
		for (int i=0;i<wordHintArr.length;i++) {x+=wordHintArr[i][0].length();};
		grid = new String[x][x][2];
		for (String i[][]:grid) {
			for (String[] j:i) {
				j[0] = "_";
			}
		}
		printFormattedArray2D(grid);
	}
	public static void printFormattedArray2D(String[][][] arr) {
		for (String[][] x:arr) {
			for(String[]y:x) {
				System.out.print(y[0]+" ");
			}
			System.out.println();
		}
	}
	
	
}
