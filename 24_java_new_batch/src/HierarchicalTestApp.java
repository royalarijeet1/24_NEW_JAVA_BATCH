import java.util.Scanner;

public class HierarchicalTestApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------enter type of employee from the below choices--------");
		System.out.println("1>  For Admin Employee");
		System.out.println("2>  For Tech Employee");
		System.out.println("select your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1: AdminEmployeeHierarchical a=new AdminEmployeeHierarchical();
					a.insert();
					a.display();
					break;
			case 2: TechEmployeeHierarichal t=new TechEmployeeHierarichal();
					t.insert();
					t.display();
		}
	}
}
