package FileHandling;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	String name;
	int std,rno;
	
	public Student()
	{
		
	}
	public Student(String name, int std, int rno) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.std=std;
		this.rno=rno;
	}


	public void disp()
	{
		System.out.println(std+" "+name+" "+rno);
	}
}
