import java.util.Scanner;

public class TestAppArray {
	public static void main(String[] args) {
		
		//array index start from 0 to n-1
		Scanner sc =new Scanner(System.in);
		int a[]=new int[5];
		
		//inserting elements in array a[]
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter a["+(i+1)+"]: ");
			a[i]=sc.nextInt();
		}
		
		//display array
//		System.out.println(a[0]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}
		
	}
}
