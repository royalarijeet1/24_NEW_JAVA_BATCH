package Inheritence;

public class SingleInheritence {
	public static void main(String[] args) {
		Employee e[]=new Employee[2];
		
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			e[i].insert();
		}
		
		System.out.println("Display the details");
		for(int i=0;i<e.length;i++)
		{
			
			e[i].display();
		}
	}
	
}
