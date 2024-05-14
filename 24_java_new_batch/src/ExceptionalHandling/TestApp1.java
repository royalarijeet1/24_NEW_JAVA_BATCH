package ExceptionalHandling;

public class TestApp1 {
	public static void main(String[] args) {
		int a=100,b=0;
		String s=null,t="123a";
		float f=12f;
		int arr[]= {1,2,3,4,6,10};
		
		System.out.println("1st statement");
		System.out.println("2st statement");
		System.out.println("next statement will cause exception error");
//		System.out.println( a/b); //Aritmetic eXCEPTION
		System.out.println(s);
//		System.out.println(s.concat("asa"));   //NullPointer
//		int i=Integer.parseInt(t);     
//		System.out.println(t);   //NumberFormat
		System.out.println(t.charAt(6));
//		System.out.println(arr[6]);
		System.out.println("4th statement");
		System.out.println("5th statement");
	}
}
