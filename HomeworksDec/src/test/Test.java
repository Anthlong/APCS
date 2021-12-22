package test;

public class Test {
	public static void main(String[] args) {
		int[][]x =new int[5][];
		int r=1;
		for (int[] y:x) {
			int[] n = new int[r];
			for (int i=0;i<r;i++) {
				n[i]=i;
			}
			y=n;
		}
		for (int[] k:x) {
			for (int p:k) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}
