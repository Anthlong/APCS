package stackTest;

public class StackTest {
	//Heaps store references of objects in memory.
	//Stacks only allow removal of objects in the order they were added.
	public static void main(String[] args) {
	int a = 1;
	int b = 1;
	System.out.println(a==b);
	String c = "cool";
	String d = new String("cool");;
	System.out.println(c==d);
	//Attempting to get conditionals of non-primitive objects compare their
	//memory address instead of their actual values. (ex. Strings)
	System.out.println("equals()? "+c.equals(d));
	System.out.println("==? "+(c==d));
	c = d;
	//If you set some variable equal to another the memory address of the two become the same.
	System.out.println(c==d);
	}
}
