package InnerClasses.AnonymousInnerClasses;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A()
		{

			@Override
			void test() {
				// TODO Auto-generated method stub
				System.out.println("A---test()");
			}
			
		};
		
		obj.test();
	}

}
