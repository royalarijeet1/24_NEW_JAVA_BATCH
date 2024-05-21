package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWeite1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			
			FileOutputStream fout = new FileOutputStream("test.txt");
			System.out.println("write a text you want to insert in a file :");
			String s=sc.nextLine();
			byte b[]=s.getBytes();
			
			
			try {
				fout.write(b);
				fout.close();
				System.out.println("Success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
