package Abstraction;

public class A4 implements showable{
	public void print()
	{
		System.out.println("showable extends printable");
	}
	public void show()
	{
		System.out.println("A4 implements showable");
	}
	public static void main(String[] args) {
		A4 obj=new A4();
		obj.print();
		obj.show();
	}
}
