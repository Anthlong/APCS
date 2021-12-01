
public class PrintNum {
	public static void main(String[] args) {
		int counter = 100;
		int x = 0;
		while (counter<=1000) {
			if (counter%5==0||counter%6==0) {
				x++;
				if (x>=10) {
					System.out.println(counter+" ");
					x = 0;
				} else {
					System.out.print(counter+" ");
				}
			}
			counter++;
		}
	}
}
