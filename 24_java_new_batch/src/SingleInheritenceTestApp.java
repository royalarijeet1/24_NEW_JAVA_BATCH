
public class SingleInheritenceTestApp {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.insert();
		Employee1 e2=new Employee1();
		e2.insert();
		Employee1 e3=new Employee1();
		e3.insert();
		
		System.out.println("display employee details");
		e1.display();
		e2.display();
		e3.display();
	}

}
