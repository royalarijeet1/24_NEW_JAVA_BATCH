package Multithreading.Task;

public class Table {
	
	int no;

	public Table(int no) {
		super();
		this.no = no;
	}
	
	void printTable()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(no+" * "+i+" = "+(no*i)+" ---- "+Thread.currentThread().getName());
		}
	}
}
