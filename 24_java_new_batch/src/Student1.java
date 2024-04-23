import java.util.Scanner;

public class Student1 {
	int rno, std;
	String name;     //variables
	
	
	//method for inserting student details
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name, rollnumber and standard:");
		name=sc.next();
		rno=sc.nextInt();
		std=sc.nextInt();
	}
	
	
	//method for inserting student details
		void display()
		{
			System.out.println(rno+" "+name+" "+std);
		}
}
