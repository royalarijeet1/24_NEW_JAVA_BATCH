package ClassesAndObjects;

public class TestApp1 {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.insert();
		e2.insert();
		e3.insert();
		
		e1.display();
		e2.display();
		e3.display();
	}
}
