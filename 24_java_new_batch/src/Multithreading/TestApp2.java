package Multithreading;

public class TestApp2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			System.out.println("Task - "+i+" - "+Thread.currentThread().getId()+" - "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		TestApp2 thread1=new TestApp2();
		TestApp2 thread2=new TestApp2();
		
		thread1.setName("A");
		thread2.setName("B");
		
		thread1.start();  //3
		thread2.start();  //3 
//		thread1.run();  //3
//		thread2.run();  //3 
	}
}
