package Encapsulation.A;

class _Private
{
	private int data=50;
	private void msg()
	{
		System.out.println("this is a private function");
	}
}

public class Z {
	private int d=40;
	private void m()
	{
		System.out.println("m() of class Z");
	}
	public static void main(String[] args) {
		Z z=new Z();
		_Private p=new _Private();
		System.out.println(z.d);
		z.m();
//		System.out.println(p.data);   //because data from _Private is private
//		System.out.println(p.msg());  //because msg() from _Private is privatep.msg();
	}
}
