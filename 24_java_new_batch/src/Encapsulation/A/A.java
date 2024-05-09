package Encapsulation.A;

class B {
	void msg()   //if any access modifier is not used, then it is default
	{
		System.out.println("Class B");
	}
}

public class A {
	void msg()   //if any access modifier is not used, then it is default
	{
		System.out.println("Class C");
	}
	public static void main(String[] args) {
		B b=new B();
		b.msg();
	}
}
