package reverse;

public class Reverse {
	public static void printReverse(String str) {
		for (int i = str.length()-1; i>=0;i--) {
		System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		printReverse("hello, world!");
	}
}
