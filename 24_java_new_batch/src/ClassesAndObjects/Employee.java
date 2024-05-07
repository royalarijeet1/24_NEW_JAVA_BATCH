package ClassesAndObjects;

import java.util.Scanner;

public class Employee {
	int salary,id;
	String name,dsgn;
	static String org="TCS";
	
	
	static void change()
	{
		org="ITC";
	}
	
	void insert()
	{
		System.out.println("enter the Details of Employee");
		System.out.println();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id of employee:");
		id=sc.nextInt();
		System.out.println("enter name of employee:");
		name=sc.next();
		System.out.println("enter the salary of employee:");
		salary=sc.nextInt();
		System.out.println("enter the designation of employee:");
		dsgn=sc.next();
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dsgn+" "+org);	
	}
}
