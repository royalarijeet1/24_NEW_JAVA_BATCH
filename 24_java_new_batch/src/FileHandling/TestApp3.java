package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp3 {
	public static void main(String[] args) {
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].scan();
		}
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("test4.txt"));
			out.writeObject(s);
			out.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
