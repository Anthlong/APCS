package rectangle;

public class RectangleTest {
	public static void info(Rectangle rect) {
		System.out.println("Information for your rectangle:\nWidth: "+rect.getWidth()+"\nHeight: "+rect.getLength()+"\nArea: "+rect.getArea()+"\nPerimeter: "+rect.getPerimeter());
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		info(r1);
		info(r2);
	}
}
