package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;


//not necessary that it maintains the insertion order
public class HashSetClass {
	public static void main(String[] args) {
		HashSet hset =new HashSet();
		
		hset.add(1);
		hset.add("a");
		hset.add("b");
		hset.add("a");
		hset.add(null);
		
		
		
		Iterator itr=hset.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
	}
}
