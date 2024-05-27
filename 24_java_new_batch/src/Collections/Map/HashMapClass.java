package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer, String>();
		hmap.put(1,"A");
		hmap.put(2, null);
		hmap.put(3, null);
		hmap.put(null,"D");
		hmap.put(null,"E");
		

		
		for(Map.Entry<Integer, String> e:hmap.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
