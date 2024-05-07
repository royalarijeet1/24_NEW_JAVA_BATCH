package ClassesAndObjects;

public class TestApp2 {
	public static void main(String[] args) {
		Employee e[]=new Employee[2];
		Employee.change();
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			e[i].insert();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
		}
	}
}
