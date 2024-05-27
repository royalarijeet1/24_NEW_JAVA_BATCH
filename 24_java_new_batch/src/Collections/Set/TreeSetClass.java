package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet tset=new TreeSet();
//		tset.add(null);
//		tset.add(2);
//		tset.add(11);
//		tset.add(10);
//		tset.add(8);
		
		tset.add("w");
		tset.add("e");
		
		Iterator itr=tset.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
	}
}
