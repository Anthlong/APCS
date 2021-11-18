package book;

public class BookTest {
	public static void main(String[] args) {
	Book cool = new Book(100);
	for (int i=1; i<=3; i++) {
		Book.nextPage();
		System.out.println("You are now on page "+cool.getPage());
	}
	System.out.println("Your book is "+cool.getPageCount()+" pages long and you are currently on page "+cool.getPage());
	}
}
