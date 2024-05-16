package ExceptionalHandling;

import java.util.Scanner;

public class TestApp2 {
	static void eligibletovote(int age) throws InvalidAgeException 
	{
		//if age <18, throw exception
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age for voting:");
		age=sc.nextInt();
		if (age<18)
		{
			throw new InvalidAgeException("Invalid age!!!\n please enter the age above 18");
		}
		else
		{
			System.out.println("eligible to vote");
		}
	}
	public static void main(String[] args) throws InvalidAgeException {
		TestApp2.eligibletovote(0);
	}
}


//"Invalid age!!!\n please enter the age above 18"