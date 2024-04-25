package Aggregation;

import java.util.Scanner;

public class TestApp2 {
	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		Address a[]=new Address[3];
		String name,city,state,country;
		int id;
		
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name for employee:");
			name=sc.next();
			System.out.println("enter the id:");
			id=sc.nextInt();
			System.out.println("enter city:");
			city=sc.next();
			System.out.println("enter state:");
			state=sc.next();
			System.out.println("enter country:");
			country=sc.next();
			
			a[i]=new Address(city, state, country);
			e[i]=new Employee(id, name, a[i]);
		}
		
		
		for(int i=0;i<3;i++)
		{
			e[i].display();
		}
		
		
	}
}
