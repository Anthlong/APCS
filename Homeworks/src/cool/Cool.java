package cool;

public class Cool {
	  public void methodA(int arg)

	{

	int num = arg * 10;

	methodB(num);

	}

	public void methodB(int arg)

	{

	System.out.print(arg + 10);

	}
	  public void main(String[] args) {
	    System.out.println("Hello world!");
	    methodA(4);
	  }
	}