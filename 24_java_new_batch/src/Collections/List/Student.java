package Collections.List;

public class Student {
	String name;
	int std,rno;
	public Student(String name, int std, int rno) {
		super();
		this.name = name;
		this.std = std;
		this.rno = rno;
	}
	
	void display()
	{
		System.out.println(rno+" "+name+" "+std);
	}
}
