package InnerClasses.NestedInterface;

public class CinI implements A.PrintI{
	public static void main(String[] args) {
		A.PrintI message=new CinI();
		message.msg();
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("interface in Class");
	}
}
