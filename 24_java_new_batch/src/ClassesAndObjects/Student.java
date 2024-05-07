package ClassesAndObjects;

public class Student {
	int rno=1,std=7;
	String name="A";
	
	void display()
	{
		System.out.println(rno+ " "+name+" "+std);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
	}
}
