package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class FileWrite2 {
	public static void main(String[] args) {
		String s;
		try {
			FileWriter fw=new FileWriter("test1.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string to write in text file:");
			s=sc.nextLine();
			fw.write(s);
			fw.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
