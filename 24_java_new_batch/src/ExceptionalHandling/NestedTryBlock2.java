package ExceptionalHandling;

public class NestedTryBlock2 {
	public static void main(String[] args) {
	try
	{
		try 
		{
		
			try
			{
				int arr[]= {1,2,3,4};
				System.out.println(arr[10]);
			}catch(ArithmeticException e)
			{
				System.out.println("Trying to occur arithmetic exception");
				System.out.println(e);
			}
		}catch(Exception e)
		{
//			System.out.println("Trying to occur null pointer exception");
			System.out.println("Trying to occur parent class");
			System.out.println(e);
		}
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Trying to occur ArrayIndexOutOfBound exception");
		System.out.println(e);
	}
	System.out.println("Rest of the code");
	}
}