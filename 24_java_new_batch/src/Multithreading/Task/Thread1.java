package Multithreading.Task;

public class Thread1 extends Thread{
	Table t=null;
	
	
	
	public Thread1(Table t) {
		
		this.t = t;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable();
	}
}
