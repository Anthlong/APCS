package acounter;
import java.util.Scanner;
public class ACount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type something...");
		String thing = in.nextLine();
		in.close();
		int ac = 0;
		for (int i=0;i<thing.length();i++) {
			if (thing.charAt(i)=='a') {
				ac++;
			}
		}
		System.out.println(ac);
	}
}
