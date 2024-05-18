package ExceptionalHandling;

import java.util.Scanner;

public class RoyalEdu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email and password:");
		String email=sc.next();
		String password=sc.next();
		
		GmailApi gmail=new GmailApi();
		
		try {
			gmail.login(email,password);
		}catch(InvalidEmailException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			gmail.signup(email,password);
		} catch (PasswordStrengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
