package InnerClasses.StaticNestedClass;

public class A {

	private static int no =100;
	
	static class B
	{
		void test()
		{
			System.out.println("No: "+no);
		}
	}
	
	public static void main(String[] args) {
		A.B inner=new A.B();
		
		inner.test();
	}
}
