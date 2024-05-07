package ClassesAndObjects;

public class Employee2 {
	int salary,id;
	String name,dsgn;
	static String org="Z";
	
	//1> Default constructor(no parameters passed)
	//2> Parameterised( parameters has been passed)
	//3> Copy Constructor( Object of the constructor has been passed 
	
	Employee2()
	{
		System.out.println("--Default Constructor Invoked");
		salary=11000;
		name="A";
		id=1;
		dsgn="Y";
	}
	Employee2(int salary,String dsgn)   //234234,"X"
	{
		this();
		System.out.println("--Parameterised Constructor Employee2(int salary,String dsgn) Invoked");
		this.salary=salary;
		this.dsgn=dsgn;
	}
//	
	Employee2(int id,String name,int salary,String dsgn)  //2,"B",234234,"X"
	{
		this(salary,dsgn);  //234234,"X"
		System.out.println("--Parameterised Constructor Employee2(int id,String name,int salary,String dsgn) Invoked");
		this.name=name;
		this.id=id;
	}
	Employee2(Employee2 e)
	{
		System.out.println("--Copy Constructor Invoked");
		this.name=e.name;
		this.id=e.id;
		this.salary=e.salary;
		this.dsgn=e.dsgn;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dsgn+" "+org);
	}
}
