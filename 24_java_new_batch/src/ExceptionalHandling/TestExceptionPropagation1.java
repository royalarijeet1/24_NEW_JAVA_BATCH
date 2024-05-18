package ExceptionalHandling;
import java.io.*;
public class TestExceptionPropagation1 {
	void m() throws IOException 
	{
		throw new IOException("device error");
//		throw new ArithmeticException();
	}
	void n()
	{
		m();
	}
	void p()
	{
		
		n();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExceptionPropagation1 obj=new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}

}
