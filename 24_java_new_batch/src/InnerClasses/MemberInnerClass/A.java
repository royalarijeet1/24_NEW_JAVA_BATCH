package InnerClasses.MemberInnerClass;

public class A {
	
	private int no=100;
	class B
	{
		void msg()
		{
			System.out.println("No: "+no);
		}
	}
	
	public static void main(String[] args) {
		A outer=new A();
		A.B inner=outer. new B();
		 
		inner.msg();
	}
	
}
