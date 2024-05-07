package ClassesAndObjects;

public class TestApp3 {
	public static void main(String[] args) {
		Employee2 e1=new Employee2();
		e1.display();
		Employee2 e3=new Employee2(2,"B",234234,"X");
		e3.display();
		Employee2 e2=new Employee2(1111111111,"w");
		e2.display();
		
		Employee2 e4=new Employee2(e2);
		e4.display();
		Employee2 e5=new Employee2(e1);
		e5.display();
	}
}
