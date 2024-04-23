import java.util.Scanner;

public class TechEmployeeHierarichal extends  EmployeeHierarical{ //id,salary,name; 
	int bonus;
	
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id of tech employee:");
		id=sc.nextInt();
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter salary:");
		salary=sc.nextInt();
		System.out.println("enter bonus:");
		bonus=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+bonus);
	}
}
