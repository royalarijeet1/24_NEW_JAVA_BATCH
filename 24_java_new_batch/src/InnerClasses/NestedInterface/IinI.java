package InnerClasses.NestedInterface;

public class IinI implements ShowInterface.PrintInterface{
	
	public void msg()
	{
		System.out.println("---PrintInterFace");
	}
	public static void main(String[] args) {
		ShowInterface.PrintInterface message=new IinI();
		message.msg();
	}
}
