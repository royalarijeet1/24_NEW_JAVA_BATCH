package Collections.List;

import java.util.Scanner;

public class Student {
	String name;
	int std,rno;
	Scanner sc=new Scanner(System.in);
//	public Student(String name, int std, int rno) {
//		super();
//		this.name = name;
//		this.std = std;
//		this.rno = rno;
//	}
	
	void scan()
	{
		
		System.out.println("enter the name of student:");
		name=sc.next();
		System.out.println("enter the standard of student");
		std=sc.nextInt();
		System.out.println("enter the Rollno of student");
		rno=sc.nextInt();
	}
	
	void display()
	{
		System.out.println(rno+" "+name+" "+std);
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println("enter the new details for student");
		System.out.println("enter the name of student:");
		name=sc.next();
		System.out.println("enter the standard of student");
		std=sc.nextInt();
		System.out.println("enter the Rollno of student");
		rno=sc.nextInt();
	}
}
