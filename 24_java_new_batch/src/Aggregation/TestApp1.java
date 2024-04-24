package Aggregation;

import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name,city, state, country;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of an employee:");
		name=sc.next();
		System.out.println("enter id of an employee:");
		id=sc.nextInt();
		System.out.println("enter the address of an employee:");
		System.out.println("enter city:");
		city=sc.next();
		System.out.println("enter state:");
		state=sc.next();
		System.out.println("enter country:");
		country=sc.next();
		Address a1=new Address(city,name,country);
		Employee e1=new Employee(id,name,a1);
		e1.display();
	
	}

}
