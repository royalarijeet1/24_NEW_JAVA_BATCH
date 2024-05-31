package Multithreading.Task;

public class Thread3 extends Thread{
	Table t=null;
	
	
	
	public Thread3(Table t) {
		
		this.t = t;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable();
	}
}
