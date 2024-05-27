package Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList lList=new LinkedList();
		
		lList.add("asdas");
		lList.add("asdas");
		lList.add(1);
		lList.add(3);
		lList.add(null);
		lList.add(null);
		
		Iterator itr=lList.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
		
	}
}
