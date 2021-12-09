package matrixCalc;
import java.util.Scanner;
public class MatrixMultiplication {
	private static int[][] matrix1;
	private static int[][] matrix2;
	private static int row1;
	private static int col1;
	private static int row2;
	private static int col2;
	public static Scanner in = new Scanner(System.in);
	public static void init() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the number of rows in the first matrix?");
		int r1 = in.nextInt();
		row1=r1;
		System.out.println("What is the number of columns in the first matrix?");
		int c1=  in.nextInt();
		col1 = c1;
		System.out.println("What is the number of rows in the second matrix?");
		int r2 = in.nextInt();
		row2 = r2;
		System.out.println("What is the number of columns in the second matrix?");
		int c2 = in.nextInt();
		col2 = c2;
		if (c1!=r2) {
			System.out.println("Warning: These matrices cannot be multiplied due to incompatible dimensions.\nPlease reenter your dimensions.");
			init();
		} else {
			matrix1 = new int[r1][c1];
			matrix2 = new int[r2][c2];
		}
		for (int i = 0; i<matrix1.length;i++) {
			for(int j = 0; j<matrix1[i].length;j++) {
				System.out.println("Enter your value for matrix1["+i+"]["+j+"]:");
				matrix1[i][j] = in.nextInt();
				printMatrix1();
			}
		}
		for (int i = 0; i<matrix2.length;i++) {
			for(int j = 0; j<matrix2[i].length;j++) {
				System.out.println("Enter your value for matrix2["+i+"]["+j+"]:");
				matrix2[i][j] = in.nextInt();
				printMatrix2();
			}
		}
		int[][] mult = new int[row1][col2];
		if (row1!=row2||col1!=col2) {
			System.out.println("The matrices cannot be added or subtracted - incompatible dimensions");
		} else {
			int[][] sum = new int[row1][col1];
			int[][] diff = new int[row1][col1];
			for (int i = 0; i<row1; i++) {
				for (int j = 0; j<col1;j++) {
					sum[i][j] = matrix1[i][j]+matrix2[i][j];
					diff[i][j] = matrix1[i][j]-matrix2[i][j];
				}
			}
			System.out.println("The sum of the two matrices is:");
			for (int i = 0; i<row1; i++) {
				for (int j = 0; j<col1;j++) {
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The difference of the two matrices is:");
			for (int i = 0; i<row1; i++) {
				for (int j = 0; j<col1;j++) {
					System.out.print(diff[i][j]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("The product of the two matrices is:");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					mult[i][j] += matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		/*for (int i = 0; i<matrix1[0].length;i++) {
			for (int k = 0; k<mult.length;k++) {
				for (int l = 0; l<mult[0].length;l++) {
				
					mult[k][l]=matrix1[k][i]*matrix2[i][l];
				
				}
			}
		}
		*/
		for (int i = 0; i<mult.length; i++) {
			for (int j = 0; j<mult[i].length;j++) {
				System.out.print(mult[i][j]+" ");
			}
			System.out.println();
		}
	}
	public MatrixMultiplication() {
		init();
	}
	public static void printMatrix1() {
		for (int i = 0; i<matrix1.length; i++) {
			for (int j = 0;j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void printMatrix2() {
		for (int i = 0; i<matrix2.length; i++) {
			for (int j = 0;j<matrix2[i].length;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
	}
	/*public void inputMatrix1() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i<matrix1.length;i++) {
			for(int j = 0; j<matrix1[i].length;j++) {
				System.out.println("Enter your value for matrix1["+i+"]["+j+"]:");
				matrix1[i][j] = in.nextInt();
				printMatrix1();
			}
		}
	}
	*/
	/*public void inputMatrix2() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i<matrix2.length;i++) {
			for(int j = 0; j<matrix2[i].length;j++) {
				System.out.println("Enter your value for matrix2["+i+"]["+j+"]:");
				matrix2[i][j] = in.nextInt();
				printMatrix2();
			}
		}
	}
	*/
	/*public void getInformation() {
		if (row1!=row2||col1!=col2) {
			System.out.println("The matrices cannot be added or subtracted - incompatible dimensions");
		} else {
			int[][] sum = new int[row1][col1];
			int[][] diff = new int[row1][col1];
			int[][] mult = new int[row1][col2];
			for (int i = 0; i<row1; i++) {
				for (int j = 0; j<col1;j++) {
					sum[i][j] = matrix1[i][j]+matrix2[i][j];
					diff[i][j] = matrix1[i][j]-matrix2[i][j];
				}
			}
			System.out.println("The sum of the two matrices is:");
			for (int i = 0; i<row1; i++) {
				for (int j = 0; j<col1;j++) {
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The difference of the two matrices is:");
			for (int i = 0; i<row1; i++) {
				for (int j = 0; j<col1;j++) {
					System.out.print(diff[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The product of the two matrices is:");
			for (int i = 0; i<mult.length;i++) {
				for (int j = 0; j<mult[i].length;i++) {
					int addend = 0;
					for (int k = 0; k<row1;k++) {
						addend+=
					}
					mult[i][j]+= addend;
				}
			}
		}
	}
	*/
}
