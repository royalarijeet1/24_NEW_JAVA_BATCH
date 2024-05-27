package Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add("A");
		q.add("W");
		q.add("G");
		q.add("E");
		
		
		
		System.out.println("head: "+q.element());  //throws exception, if there is empty element
		System.out.println("peek: "+q.peek());  //returns null, if there is empty element
		
		Iterator itr=q.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
		
		q.remove();  //throws exception, if there is empty element
		q.poll(); //returns nothing, if there is empty element
		
		
		System.out.println();
		System.out.println("after removing two elements from top");
		Iterator itr2=q.iterator();
		
		while(itr2.hasNext())
		{
			Object o=itr2.next();
			System.out.println(o);
		}
	}
}
