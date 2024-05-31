package Multithreading.Task;

public class TestApp1 {
	public static void main(String[] args) {
		Table res1=new Table(10);
		Table res2=new Table(20);
		Table res3=new Table(30);
		
		Thread1 t1=new Thread1(res1);
		Thread1 t2=new Thread1(res2);
		Thread1 t3=new Thread1(res3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
