package tictactoe;
import java.util.Scanner;
public class TicTacToeGrid {
	private Scanner sc;
	private int first;
	private int pl;
	private TicTacToe[][] grid = new TicTacToe[3][3];
	public TicTacToeGrid(Scanner s) {
		for (int i=0;i<3;i++) {
			for (int k=0;k<3;k++) {
				grid[i][k] = new TicTacToe();
			}
		}
		sc = s;
		pl=0;
	}
	public void initGame() {
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("Would you like to go first? (y/n)");
		if (sc.nextLine().equals("y")) {
			first = 0;
		} else {
			first = 1;
		}
		if (first==0) {
			while (check("X").equals("none")&&check("O").equals("none")) {
				if (pl==0) {
					if (checkFull()) {
						printGrid();
						System.out.println("Draw - No more moves!");
						break;
					}
					replace();
					if (!check("X").equals("none")) {
						printGrid();
						System.out.println("Player 0 wins!");
						break;
					}
					pl=1;
				} else if (pl==1) {
					if (checkFull()) {
						printGrid();
						System.out.println("Draw - No more moves!");
						break;
					}
					System.out.println("\nPlayer 1 (computer) is moving...");
					//int brow = findSuitable("O")[0];
					//int bcol = findSuitable("O")[1];
					//grid[brow][bcol].changeStatus(pl);
					int[] b = findRandomSuitable();
					grid[b[0]][b[1]].changeStatus(pl);
					if (!check("O").equals("none")) {
						printGrid();
						System.out.println("Player 1 wins!");
						break;
					}
					pl = 0;
				}
			}
		} else if (first==1) {
			while (check("X").equals("none")&&check("O").equals("none")) {
				if (pl==0) {
					if (checkFull()) {
						printGrid();
						System.out.println("Draw - No more moves!");
						break;
					}
					System.out.println("\nPlayer 0 (computer) is moving...");
					//int brow = findSuitable("X")[0];
					//int bcol = findSuitable("X")[1];
					//grid[brow][bcol].changeStatus(pl);
					int[] b = findRandomSuitable();
					grid[b[0]][b[1]].changeStatus(pl);
					if (!check("X").equals("none")) {
						printGrid();
						System.out.println("Player 0 wins!");
						break;
					}
					pl = 1;
				} else if (pl==1) {
					if (checkFull()) {
						printGrid();
						System.out.println("Draw - No more moves!");
						break;
					}
					replace();
					if (!check("O").equals("none")) {
						printGrid();
						System.out.println("Player 1 wins!");
						break;
					}
					pl=0;
					
				}
			}
				
		}
	}
	public String check(String val) {
		//diagonal checks
		if (grid[0][0].getStatus().equals(val)&&!(grid[0][0].getStatus().equals(" "))){
			if (grid[0][0].getStatus().equals(grid[1][1].getStatus())&&grid[0][0].getStatus().equals(grid[2][2].getStatus())) {
				return val;
			}
		}
		if (grid[2][0].getStatus().equals(val)&&!(grid[2][0].getStatus().equals(" "))){
			if (grid[2][0].getStatus().equals(grid[1][1].getStatus())&&grid[2][0].getStatus().equals(grid[0][2].getStatus())) {
				return val;
			}
		}
		//row checks
		for (int r = 0;r<3;r++) {
			if (!grid[r][0].getStatus().equals(" ")&&grid[r][0].getStatus().equals(val)) {
				if (grid[r][0].getStatus().equals(grid[r][1].getStatus())&&grid[r][0].getStatus().equals(grid[r][2].getStatus())){
					return val;
				}
			}
		}
		//column checks
		for (int c = 0;c<3;c++) {
			if ((!(grid[0][c].getStatus().equals(" ")))&&(grid[0][c].getStatus().equals(val))) {
				if ((grid[0][c].getStatus().equals(grid[1][c].getStatus()))&&(grid[0][c].getStatus().equals(grid[2][c].getStatus()))){
					return val;
				}
			}
		}
		return "none";
	}
	public void printGrid() {
		System.out.println(" "+grid[0][0].getStatus()+" | "+grid[0][1].getStatus()+" | "+grid[0][2].getStatus());
		System.out.println("---|---|---");
		System.out.println(" "+grid[1][0].getStatus()+" | "+grid[1][1].getStatus()+" | "+grid[1][2].getStatus());
		System.out.println("---|---|---");
		System.out.println(" "+grid[2][0].getStatus()+" | "+grid[2][1].getStatus()+" | "+grid[2][2].getStatus());
	}
	public void replace() {
		printGrid();
		System.out.println("Player "+(pl)+", enter your X,Y coordinates:");
		String g = sc.nextLine();
		try {
			int col = Character.getNumericValue(g.charAt(0));
			//System.out.println("Test");
			int row = Character.getNumericValue(g.charAt(2));
			if (col>=4||col<=0||row>=4||row<=0) {
				throw new ArrayIndexOutOfBoundsException();
			}
			//System.out.println("Test2");
			if (grid[row-1][col-1].getStatus().equals(" ")) {
				//System.out.println("Test5");
				grid[row-1][col-1].changeStatus(pl);
			} else {
				//System.out.println("Test4");
				System.out.println("Position already occupied, try again");
				replace();
			}
			//System.out.println("Test3");
		} catch (Exception e) {
			System.out.println("Invalid format or position, try again");
			replace();
		}
	}
	/* bad code */
	public int scenario(String x) {
		//0 = error
		//1,2,3 = row
		//4,5,6 = column
		//7,8 = diagonal
		int scenario = 0;
		int d1 = 0;
		int d2 = 0;
		int[] r = {0,0,0};
		int[] c = {0,0,0};
		//diagonals
		for (int i=0; i<3;i++) {
			if (grid[i][i].getStatus().equals(x)) {
				d1++;
			}
		}
		for (int i=0; i<3;i++) {
			if (grid[2-i][i].getStatus().equals(x)) {
				d2++;
			}
		}
		for (int i=0;i<3;i++) {
			for (int j=0; j<3;j++) {
				if (grid[i][j].getStatus().equals(x)) {
					r[i]++;
				}
			}
		}
		for (int i=0;i<3;i++) {
			for (int j=0; j<3;j++) {
				if (grid[j][i].getStatus().equals(x)) {
					c[i]++;
				}
			}
		}
		int max =0;
		for (int i=0; i<r.length;i++) {
			if (r[i]>max) {
				max = r[i];
				scenario = 1+i;
			}
		}
		for (int i=0; i<r.length;i++) {
			if (c[i]>max) {
				max = r[i];
				scenario = 4+i;
			}
		}
		if (d1>max) {max=d1;scenario=7;};
		if (d2>max) {max=d2;scenario=8;};
		return scenario;
	}
	public int[] findSuitable(String x) {
		if (scenario(x)==1||scenario(x)==2||scenario(x)==3) {
			for (int i=0;i<3;i++) {
				if (grid[scenario(x)-1][i].getStatus().equals(" ")) {
					int[] t = {i, scenario(x)-1};
					return t;
				}
			}
		} else if (scenario(x)==4||scenario(x)==5||scenario(x)==6) {
			for (int i=0;i<3;i++) {
				if (grid[i][scenario(x)-4].getStatus().equals(" ")) {
					int[] t = {i,scenario(x)-4};
					return t;
				}
			}
		} else if (scenario(x)==7) {
			for (int i=0;i<3;i++) {
				if (grid[i][i].getStatus().equals(" ")) {
					int[] t = {i,i};
					return t;
				}
			}
		} else if (scenario(x)==8) {
			for (int i=0;i<3;i++) {
				
			}
		}
		for (int i=0;i<3;i++) {
			for (int k=0;k<3;k++) {
				if (grid[i][k].getStatus().equals(" ")) {
					int[] t = {i,k};
					return t;
				}
			}
		}
		int[] u = {0,0};
		return u;
	}
	public int[] findRandomSuitable() {
		int counter=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (grid[i][j].getStatus().equals(" ")) {
					counter++;
				}
			}
		}
		int c = 0;
		int[][] possibleCoords = new int[counter][2];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (grid[i][j].getStatus().equals(" ")) {
					int[] r = {i, j};
					possibleCoords[c] = r; 
					c++;
				}
			}
		}
		return possibleCoords[(int)(Math.random()*counter)];
	}
	public boolean checkFull() {
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (grid[i][j].getStatus().equals(" ")) {
					return false;
				}
			}
		}
		return true;
	}
	/* */
}
