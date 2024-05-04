package Abstraction;

public class A1 implements printable{
	public void print()
	{
		System.out.println("Inheritating printable interface");
	}
	public static void main(String[] args) {
		A1 obj=new A1();
		obj.print();
	}
}
