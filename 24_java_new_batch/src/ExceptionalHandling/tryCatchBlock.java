package ExceptionalHandling;

public class tryCatchBlock {
	public static void main(String[] args) {
		try
		{
			String s=null;
			System.out.println(s.length());
			System.out.println("this is try block");
			int a[]=new int[5];
			int data=50/0;   //
			a[6]=10;   //this is an exception
			
			System.out.println("as exception will occurs in above statement, so this line will not print");
		}
		catch(NumberFormatException e)
		{
			System.out.println("rest of the code");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("can't divide it by zero");
			//int data2=10/0;   //exception will occur
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
			System.out.println(e);
		}
		
	}
}
