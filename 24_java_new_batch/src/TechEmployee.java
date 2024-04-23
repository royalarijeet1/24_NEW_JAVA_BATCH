import java.util.Scanner;

//child 2
public class TechEmployee extends Employee2 {   //name,dsgn,id
	int salary;
	
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of an employee:");
		id=sc.nextInt();
		System.out.println("Enter name of an employee:");
		name=sc.next();
		System.out.println("Enter the salary of an employee:");
		salary=sc.nextInt();
		System.out.println("enter the designation of an employee:");
		dsgn=sc.next();
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dsgn);
	}
	public static void main(String[] args) {
		TechEmployee t=new TechEmployee();
		System.out.println("enter the details of employee:");
		t.insert();
		System.out.println("display the details of employee:");
		t.display();
	}
}
