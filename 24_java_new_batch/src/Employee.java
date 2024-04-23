
public class Employee {
	int id,salary;String dsgn,name,org;	
	Employee()
	{
		System.out.println("--default constructor--");
		id=1;
		salary=25000;
		name="A";
		dsgn="Y";
		org="z";
	}
//	Employee(int i,String n, int s,String d,String o )
//	{
//		System.out.println("--parameterised constructor--");
//		id=i;
//		name=n;
//		salary=s;
//		dsgn=d;
//		org=o;
//	}
	Employee(int id, int salary, String dsgn)  //3,17000,"D"
	{
		this();
		System.out.println("--parameterised constructor Employee(int id, int salary, String dsgn)--");
		this.id=id;
		this.salary=salary;
		this.dsgn=dsgn;
	}
	Employee(int id,String name, int salary,String dsgn,String org )  //2,"B",20000,"R","Z"
	{
		this(id,salary,dsgn);  //2, 20000, R
		System.out.println("--parameterised constructor--");
		this.name=name;
		this.org=org;
	}
//	Employee(Employee e4)
//	{
//		System.out.println("--copying e2 constructor--");
//		this.id=e4.id;
//		this.name=e4.name;
//		this.salary=e4.salary;
//		this.dsgn=e4.dsgn;
//		this.org=e4.org;
//	}
	Employee(Employee e5)
	{
		System.out.println("--copying e3 constructor--");
		this.id=e5.id;
		this.name=e5.name;
		this.salary=e5.salary;
		this.dsgn=e5.dsgn;
		this.org=e5.org;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dsgn+" "+org);
	}
	
}
