package Encapsulation.A;

class _Protected
{
	protected void msg()
	{
		System.out.println("this is _Protected class");
	}
}
public class D {
	protected void msg()
	{
		System.out.println("this is D class");
	}
	public static void main(String[] args) {
		_Protected p=new _Protected();
		p.msg();
	}
}
