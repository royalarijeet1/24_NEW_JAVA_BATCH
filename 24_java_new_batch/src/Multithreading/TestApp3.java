package Multithreading;

public class TestApp3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is implementing Runnable interface");
	}
	
	public static void main(String[] args) {
		TestApp3 t1=new TestApp3();
		
		Thread thread1=new Thread(t1);
		
		thread1.start();
	}
	
}
