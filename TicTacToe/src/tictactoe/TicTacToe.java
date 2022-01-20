package tictactoe;

public class TicTacToe {
	private String status;
	public TicTacToe(){
		status = " ";
	}
	public String getStatus() {
		return status;
	}
	public void changeStatus(int p) {
		if (status.equals(" ")) {
			if (p==0) {
				status="X";
			} else if (p==1) {
				status="O";
			}
		} else {
			System.out.println("Invalid position or position already taken. Try again.");
		}
	}
}
