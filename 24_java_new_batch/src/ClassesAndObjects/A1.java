package ClassesAndObjects;

public class A1 {
	
	
	void normalF()
	{
		System.out.println("normalF() is invokeds");
	}
	{
		System.out.println("instance block is invokeds");
	}
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.normalF();
		System.out.println("hi");
	}
}
