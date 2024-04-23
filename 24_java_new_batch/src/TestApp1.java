
public class TestApp1 {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		Student1 s4=new Student1();
		Student1 s5=new Student1();
		
		System.out.println("enter Student details");
		s1.input();
		s2.input();
		s3.input();
		s4.input();
		s5.input();
		
		System.out.println("display Student details");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}
}
