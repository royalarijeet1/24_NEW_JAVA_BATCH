
public class Student {
	int rno=1, std=12;
	String name="A";     //variables
	
	
	
	public static void main(String[] args) {
		Student s1=new Student();  //object  //new is a keyword which allocates memory
									//where Student is a class and s1 is an object
		
		System.out.println("Student roll number: "+s1.rno);
		System.out.println("Student name: "+s1.name);
		System.out.println("Student standard: "+s1.std);
		
		
	}
	
	
}
