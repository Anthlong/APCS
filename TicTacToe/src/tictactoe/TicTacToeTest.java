package tictactoe;
import java.util.Scanner;
public class TicTacToeTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TicTacToeGrid game = new TicTacToeGrid(in);
		game.initGame();
	}
}
