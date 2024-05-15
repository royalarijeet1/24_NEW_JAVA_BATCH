package ExceptionalHandling;

import java.io.IOException;

//if a parent class throws exception
public class Overriden2 extends Parent2{
//	void msg() throws Exception()   //compile time error
//	{
//		
//	}
//	void msg() throws IOException()   //compile time error
//	{
//		
//	}
//	void msg() throws ArrayIndexOutOfBoundsException   
//	{
//		System.out.println("child exception");
//	}
	static void msg() throws NullPointerException
	{
		System.out.println("child exception");
	}
	public static void main(String[] args) {
		Overriden2.msg();
	}
}
