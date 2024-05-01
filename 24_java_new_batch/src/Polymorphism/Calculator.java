package Polymorphism;


//method Overloading
public class Calculator {
	static int add(int a, int b)
	{
		System.out.println("---add(int a,int b)---");
		return a+b;
	}
//	public int add(int a, int b)
//	{
//		System.out.println("---add(int a,int b)---");
//		return a+b;
//	}
	
	static int add(int a, int b,int c)
	{
		System.out.println("---add(int a,int b, int c)---");
		return a+b+c;
	}
//	public int add(int a, int b,int c)
//	{
//		System.out.println("---add(int a,int b, int c)---");
//		return a+b+c;
//	}
	
}
