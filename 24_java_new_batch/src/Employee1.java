import java.util.Scanner;

public class Employee1 extends Person{
	int id,salary;
	String dsgn,org;
	
	void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		id=sc.nextInt();
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter salary:");
		salary=sc.nextInt();
		System.out.println("enter designation:");
		dsgn=sc.next();
		System.out.println("enter organisation:");
		org=sc.next();
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dsgn+" "+org);
	}
}
