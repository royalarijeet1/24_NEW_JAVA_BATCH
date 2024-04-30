package Encapsulation;

import java.util.Scanner;

public class TestApp1 {
	public static void main(String[] args) {
		int rno,std;
		String name, college;
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student rollno:");
		rno=sc.nextInt();
		s.setRno(rno);
		System.out.println("enter student name:");
		name=sc.next();
		s.setName(name);
		System.out.println("enter standard of student:");
		std=sc.nextInt();
		s.setStd(std);
		System.out.println("enter college of student:");
		college=sc.next();
		s.setCollege(college);
		
		
		System.out.println(s.getRno()+ " "+s.getName()+" "+s.getStd()+s.getCollege());
		
	}
}
