package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead1 {
	public static void main(String[] args) {
		int i=0;
		StringBuffer sb=new StringBuffer();
		try {
			FileInputStream fin=new FileInputStream("test.txt");
			try {
				while((i=fin.read())!=-1)
				{
					sb.append((char)i);
				}
				
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Final String: "+sb);
		

			
		
	}
}
