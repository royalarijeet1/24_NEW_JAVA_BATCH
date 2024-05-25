package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentArrayList {
	public static void main(String[] args) {
		int choice=0,searchRno=0,i=0;
		Scanner sc=new Scanner(System.in);
		Student s=null;
		boolean flag;
		ArrayList<Student> list=new ArrayList();
		//insert, update, delete, view
		
		while(choice!=5)
		{
			System.out.println("-----enter the below choice:");
			System.out.println("1> For insert student");
			System.out.println("2> For update student record by rollno");
			System.out.println("3> For delete student record by rollno");
			System.out.println("4> For displaying student record");
			System.out.println("5> For exiting applications");
			System.out.println();
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: s=new Student();
						s.scan();
						list.add(s);
						System.out.println("student record inserted");
						break;
				case 2: System.out.println("enter rollno which you want to update student record:");
				        searchRno=sc.nextInt();
				        flag=false;
						for(;i<list.size();i++)
				        {
				        	s=list.get(i);
				        	
				        	if(s.rno==searchRno)
				        	{
				        		flag=true;
				        		break;
				        	}
				        }
						
						if(flag)
						{
							s.update();
							System.out.println("given statement updated successfully");
						}
						else
						{
							System.out.println("record not found");
						}
						break;
				case 3: System.out.println("enter rollno which you want to delete the record:");
						searchRno=sc.nextInt();
				        flag=false;
						for(;i<list.size();i++)
				        {
				        	s=list.get(i);
				        	
				        	if(s.rno==searchRno)
				        	{
				        		flag=true;
				        		break;
				        	}
				        }
						
						if(flag)
						{
							list.remove(i);
							System.out.println("given record deleted successfully");
						}
						else
						{
							System.out.println("record not found");
						}
						break;
				case 4:  Iterator<Student> itr=list.iterator();
						 while(itr.hasNext())
						 {
							s=itr.next();
							s.display();
						 }
						 break;
				case 5: System.out.println("student application shutdown");
						System.exit(0);
						break;
			}
		}
		
	}
}
