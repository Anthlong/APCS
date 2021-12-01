package ssn;
import java.util.Scanner;
public class SSN {
	public static String ssnNoDash(String str) {
		String aux = "";
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)!='-') {
				aux+=String.valueOf(str.charAt(i));
			}
		}
		return aux;
	}
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("What is your social security number? \nEnter in the format of XXX-XX-XXXX.");
		String ssn = in.nextLine();
		in.close();
		System.out.println(ssnNoDash(ssn));
	}
}
