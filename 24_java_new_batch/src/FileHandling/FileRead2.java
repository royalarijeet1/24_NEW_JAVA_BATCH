package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		try {
			
			FileReader fr=new FileReader("test1.txt");
			int i;
			try {
				while((i=fr.read())!=-1)
				{
					sb.append((char)i);
				}
			fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fINAL output: "+sb);
	}
}
