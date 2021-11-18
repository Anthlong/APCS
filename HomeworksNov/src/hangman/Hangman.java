package hangman;
import java.util.Scanner;
public class Hangman {
	private final String[] wordArray = {"fireman","chair","cookie","can","wind"};
	private final String[] hintArray = {"They use water for their job.","Something you spend a lot of time on top of.","A tasty treat commonly used on websites to store user data","Usually made of aluminum or tin","Can destroy trees."};
	public String[] getRandomWord() {
		int index = (int)(Math.random()*5);
		String[] wrapperClass = {wordArray[index],""+index};
		return wrapperClass;
	}
	public String getHintFromIndex(int ind) {
		return hintArray[ind];
	}
	public void hangmanGame() {
		Scanner in = new Scanner(System.in);
		String[] wordWrapper = getRandomWord();
		String word = wordWrapper[0];
		String blank = "";
		for (int j = 0; j<word.length();j++) {
			blank+="_";
		}
		int hintindex = Integer.parseInt(wordWrapper[1]);
		int counter = 3;
		boolean firstFail = true;
		int numCorrect = 0;
		while (counter>=1) {
			System.out.println(blank);
			System.out.println("Type in a guess (single letter):");
			String guess = in.nextLine();
			boolean correct = false;
			for (int i = 0; i<word.length();i++) {
				if (guess.equals(String.valueOf(word.charAt(i)))) {
					correct = true;
				}
			}
			if (correct) {
				System.out.println("You guessed a letter!");
				blank = blank.substring(0,word.indexOf(guess))+guess+blank.substring(word.indexOf(guess)+1);
				word = word.substring(0,word.indexOf(guess))+"_"+word.substring(word.indexOf(guess)+1);
				numCorrect++;
				if (numCorrect>=word.length()) {
					break;
				}
			} else {
				if (firstFail) {
					System.out.println("Not correct...");
					System.out.println(hintindex);
					System.out.println("Here's a hint:\n"+getHintFromIndex(hintindex));
					System.out.println("You have "+(counter-1)+" guess(es) remaining.");
					firstFail=false;
				} else {
					System.out.println("Not correct...\nYou have "+(counter-1)+" guess(es) remaining.");
				}
				counter--;
			}
			System.out.println("");
		}
		if (counter>0) {
			System.out.println(blank);
			System.out.println("Congratulations, you won!");
		} else {
			System.out.println("Sorry, you lost.");
		}
		in.close();
	}
}
