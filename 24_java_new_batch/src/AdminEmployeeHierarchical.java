import java.util.Scanner;

public class AdminEmployeeHierarchical extends EmployeeHierarical{ ////id,salary,name
	String dsgn;
	
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id of admin employee:");
		id=sc.nextInt();
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter salary:");
		salary=sc.nextInt();
		System.out.println("enter designation:");
		dsgn=sc.next();
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dsgn);
	}
}
