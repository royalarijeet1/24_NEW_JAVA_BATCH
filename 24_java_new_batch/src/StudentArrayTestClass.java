
public class StudentArrayTestClass {
	public static void main(String[] args) {
		Student1 s[]=new Student1[5];
		
		
		System.out.println("enter Student details:");
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student1();
			s[i].input();
		}
		System.out.println();
		System.out.println("display Student details:");
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}
}
