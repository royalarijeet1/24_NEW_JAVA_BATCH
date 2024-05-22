package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TestApp2 {
	public static void main(String[] args) {
		try {
			ObjectInputStream in =new ObjectInputStream(new FileInputStream("test3.txt"));
			try {
				Student s= (Student) in.readObject();
				
				System.out.println(s.name+" "+s.std+" "+s.rno);
				in.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
