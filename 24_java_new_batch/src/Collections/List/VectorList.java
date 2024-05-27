package Collections.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {
	public static void main(String[] args) {
		Vector vList=new Vector();
		vList.add("asdas");
		vList.add("asdas");
		vList.add(1);
		vList.add(3);
		
		
		Iterator itr=vList.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
	}
}
