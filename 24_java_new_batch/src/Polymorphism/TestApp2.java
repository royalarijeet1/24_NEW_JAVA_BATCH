package Polymorphism;



class Calculator2
{
	static int add(int a,int b)
	{
		System.out.println("---int add(int a,int b)---");
		return a+b;
	}
	
	static double add(double a, double b)
	{
		System.out.println("---double add(double a, double b)---");
		return a+b;
	}
}
public class TestApp2 {
	public static void main(String[] args) {
		System.out.println(Calculator2.add(10, 11));
		System.out.println(Calculator2.add(12.3, 13.4));
	}
}
