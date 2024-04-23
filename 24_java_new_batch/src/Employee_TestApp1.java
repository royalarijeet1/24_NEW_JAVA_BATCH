
public class Employee_TestApp1 {
	public static void main(String[] args) {
		Employee e1=new Employee();  //default constructor(as no parameters has been passed)
		e1.display();
		
		Employee e2=new Employee(3,17000,"D");  
		e2.display();
		
		Employee e3=new Employee(2,"B",20000,"R","Z");  //PARAMETERISED CONSTRUCTOR AS PARAMETERS 
														// HAS BEEN PASSED
		e3.display();
		 
//		Employee e4=new Employee(e2);  
//		e4.display();
		
		Employee e5=new Employee(e3);  
		e5.display();


	}
}
