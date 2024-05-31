package Multithreading.Task;

public class Thread2 extends Thread{
	Table t=null;
	
	
	
	public Thread2(Table t) {
		
		this.t = t;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable();
	}
}
