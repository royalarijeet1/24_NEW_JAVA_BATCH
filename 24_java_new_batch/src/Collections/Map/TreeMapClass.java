package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class TreeMapClass {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer, String>();

		
		hmap.put(1,"A");
		hmap.put(2, null);
		hmap.put(3, null);
		hmap.put(6,"D");
		hmap.put(5,"E");
		
		for(Map.Entry<Integer, String> e:hmap.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}

