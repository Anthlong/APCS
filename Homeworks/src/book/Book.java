package book;

public class Book {
	private static int numPages;
	private static int currentPage;
	public Book(int n) {
		currentPage = 1;
		numPages = n;
	}
	public static void nextPage() {
		if (currentPage<numPages) {
			currentPage++;
		}
	}
	public static int getPage() {
		return currentPage;
	}
	public static int getPageCount() {
		return numPages;
	}
	
}
