package Abstraction;

public class A2 implements printable,showable{
	public void print()
	{
		System.out.println("A2 inheritating printable interface");
	}
	public void show()
	{
		System.out.println("A2 inheritating showable interface");
	}
	public static void main(String[] args) {
		A2 obj=new A2();
		obj.print();
		obj.show();
	}
}
