package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 {
	public static void main(String[] args) {
		Student s1=new Student("A",12,1);
		Student s2=new Student("B",12,2);
		Student s3=new Student("C",10,3);
		Student s4=new Student("D",9,4);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println(list);
		
		
		//1> By Loop
		System.out.println("for loop");
		for(int i=0;i<list.size();i++)
		{
			Object obj=list.get(i);
			
			if(obj instanceof Student)
			{
				Student sobj= (Student)obj;
				sobj.display();
			}
		}
		System.out.println();
		
//		//2> For Each loop
		System.out.println("by for each");
		for(Object obj:list)
		{
			if(obj instanceof Student)
			{
				Student sobj= (Student)obj;
				sobj.display();
			}
			else
			{
				System.out.println(obj);
			}
		}
//		
	System.out.println();
		//3> By Iterator
		System.out.println("by Iterator");
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			
			if(obj instanceof Student)
			{
				Student sobj= (Student)obj;
				sobj.display();
			}
			else
			{
				System.out.println(obj);
			}
		}
	}
}
