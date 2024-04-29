package Encapsulation;



class _Private
{
	private int data=40;
	private void msg()
	{
		System.out.println("this is a private function");
	}
}



public class Z {
	
	private int d=40;
	private void m()
	{
		System.out.println("m() of class A");
	}
	public static void main(String[] args) {
		_Private p=new _Private();
		Z a=new Z();
//		System.out.println(p.data);   //because data from _Private is private
//		System.out.println(p.msg());  //because msg() from _Private is private
		System.out.println(a.d);
		a.m();
	}
} 
