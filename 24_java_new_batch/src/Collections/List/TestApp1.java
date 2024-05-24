package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;


public class TestApp1 {
	public static void main(String[] args) {
			ArrayList list=new ArrayList();
			list.add("A");
			list.add(10);
			list.add(12L);
			list.add('c');
			
			System.out.println("size of list: "+list.size());
			
			list.add(13.3f);
			System.out.println("size of list: "+list.size());
			
//			System.out.println(list);
			
//			System.out.println(list.get(5));
			
			//1> By Loop
			System.out.println("for loop");
			for(int i=0;i<list.size();i++)
			{
				System.out.println("list["+(i+1)+"]"+list.get(i));
			}
			System.out.println();
			
			//2> For Each loop
			System.out.println("by for each");
			for(Object obj:list)
			{
				System.out.println(obj);
			}
			
			System.out.println();
			//3> By Iterator
			System.out.println("by Iterator");
			Iterator itr=list.iterator();
			boolean b=itr.hasNext();
			while(itr.hasNext())
			{
				Object obj=itr.next();
				System.out.println(obj);
			}
			
//			System.out.println(b);
	}
}
