package reverseSentence;
import java.util.Scanner;
public class ReverseSentence {
	private static String sen;
	public ReverseSentence(String s) {
		sen = s;
	}
	public static String reversedString() {
		String rev = "";
		for (int i = sen.length()-1; i>=0; i--) {
			String aux=  "";
			if (sen.charAt(i)==' '||i==sen.length()-1) {
				if (sen.substring(sen.length()-i).lastIndexOf(" ")!=-1) {
					aux=sen.substring(sen.lastIndexOf(" "),i);
				} else {
					aux=sen.substring(0,i);
				}
			}
			rev+=aux;
		}
	return rev;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Write a sentence");
		String str = in.nextLine();
		sen=str;
		in.close();
		System.out.println(reversedString());
	}
}
