package Polymorphism;



class Typecast1
{
//	static void sum(int a, long b)
//	{
//		System.out.println("----sum(int a, long b)----");
//		System.out.println(a+b);
//	}
//	static void sum(int a,int b,int c)
//	{
//		System.out.println("----sum(int a,int b,int c)----");
//		System.out.println(a+b+c);
//	}
	static void sum(int a, double b)
	{
		System.out.println("----sum(int a, double b)----");
		System.out.println(a+b);
	}
	static void sum(double a, int b)
	{
		System.out.println("----sum(int a, double b)----");
		System.out.println(a+b);
	}
	static void sum(int a, int b)
	{
		System.out.println("----sum(int a, double b)----");
		System.out.println(a+b);
	}
//	static void sum(double a, double b)
//	{
//		System.out.println("----sum(int a, double b)----");
//		System.out.println(a+b);
//	}
}



public class TestApp3 {
	public static void main(String[] args) {
		
//		Typecast1.sum(20, 30,40);
		Typecast1.sum(20, 20);  //ambiguity
	}
}
