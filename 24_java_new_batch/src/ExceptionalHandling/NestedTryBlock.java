package ExceptionalHandling;

public class NestedTryBlock {
	public static void main(String[] args) {
	try
	{
		System.out.println("outside index range");
		int a[]=new int[5];
	//	a[5]=4;  //arrayindex out of bound
		try
		{
			System.out.println("going to divide by 0");
			int b=12/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index should be within the range");
		System.out.println(e);
	}
		System.out.println("rest of the code");
	}
}
