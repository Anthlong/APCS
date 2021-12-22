package classwork;
import java.util.Scanner;
public class Covers {
	public static void printValues(double[][] matrix) {
		for (double[] x : matrix) {
			for (double y: x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void inputValues(double[][] matrix, Scanner input) {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				printValues(matrix);
				System.out.println("Input value for matrix["+i+"]["+j+"]");
				matrix[i][j] = input.nextDouble();
			}
		}
	}
	public static boolean covers(double[][] m1, double[][] m2) {
		int counter = 0;
		for (int i = 0; i<m1.length;i++) {
			for (int j=0;j<m1[i].length;j++) {
				if (m2[i][j]==m1[i][j]) {
					counter++;
				}
			}
		}
		return (counter>4)?true:false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] mat1 = new double[3][3];
		double[][] mat2 = new double[3][3];
		inputValues(mat1,in);
		inputValues(mat2,in);
		System.out.println(covers(mat1,mat2));
		in.close();
	}
}
