package arraycoords;
public class ArrayCoords {
	private static int[][] grades = {{99,42,74,83,100},{90,91,72,88,95},{88,61,74,89,96},{61,89,82,98,93},{93,73,75,78,99},{50,65,92,87,94}};
	public static void main(String[] args) {
		int low = 100;
		int high = 0;
		for(int i = 0; i<grades.length;i++) {
			for(int j = 0; j<grades[i].length;j++) {
				if (grades[i][j]<low) {
					low=grades[i][j];
				}
				if (grades[i][j]>high) {
					high=grades[i][j];
				}
			}
		}
		System.out.println("Low: "+low+" High: "+high);
	}
}
