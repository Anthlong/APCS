import java.util.Scanner;
public class TriangleStar {
	public static String triangle(int size, int leftRightCenter) {
		String tri = "";
		if (leftRightCenter==1) {
			for (int j=1; j<=size; j++) {
				String stars = "";
				for (int i=1; i<=j; i++) {
					stars += "*";
				}
				tri = tri+ stars+"\n";
			}
		} else if (leftRightCenter==2) {
			for (int j=1; j<=size; j++) {
				String stars = "";
				String spaces = "";
				for (int i=1; i<=j; i++) {
					stars += "*";
				}
				for (int k=0;k<=(size-j);k++) {
					spaces+=" ";
				}
				tri = tri+spaces+ stars+"\n";
			}
		} else if (leftRightCenter==3) {
			for (int j=1; j<=size; j++) {
				String stars = "";
				String spaces = "";
				int spacesRequired;
				for (int i=1; i<=j; i++) {
					stars += "*";
				}
				for (int k=0;k<=(int)(size-j)/2;k++) {
					spaces+=" ";
				}
				tri = tri+spaces+ stars+"\n";
			}
		}
		return tri;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What orientation would you like your triangle to be in? (1=left,2=right,3=centered):");
		int lrc = input.nextInt();
		System.out.println("What is the size of your triangle?");
		int size = input.nextInt();
		input.close();
		System.out.println(triangle(size,lrc));
	}
}
