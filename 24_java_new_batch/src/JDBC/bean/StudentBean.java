package JDBC.bean;

public class StudentBean {
	private int rno;
	private String name;
	private int std;
	public StudentBean(int rno, String name, int std) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public StudentBean() {
		
		// TODO Auto-generated constructor stub
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	
	
}
