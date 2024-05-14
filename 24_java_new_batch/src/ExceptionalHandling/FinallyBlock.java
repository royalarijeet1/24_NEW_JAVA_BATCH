package ExceptionalHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		try
		{
			System.out.println("Here the execution starts");
			System.out.println(10/0);
			String s=null;
			s.length();
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}finally
		{
			System.out.println("finally block is executed");
		}
		System.out.println("rest of the code");
	}
}
