package InnerClasses.LocalInnerClass;

public class A {
	
	
	private int no=10;   //instance variable
	
	
	void test()   //method
	{
		
		//local inner class
		class B
		{
			void msg()
			{
				System.out.println("test---->B--->No: "+no);
			}
		}
		B inner=new B();
		inner.msg();
	}
	
	
	
	public static void main(String[] args) {
		A outer=new A();
		outer.test();
	}
}
