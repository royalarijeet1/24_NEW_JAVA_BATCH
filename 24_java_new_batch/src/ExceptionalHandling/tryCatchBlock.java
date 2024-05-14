package ExceptionalHandling;

public class tryCatchBlock {
	public static void main(String[] args) {
		try
		{
			System.out.println("this is try block");
			
			int a[]=new int[5];
			a[6]=10;
			int data=50/0;   //
			System.out.println("as exception will occurs in above statement, so this line will not print");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("can't divide it by zero");
	//		int data2=10/0;   //exception will occur
		}
		
		System.out.println("rest of the code");
	}
}
