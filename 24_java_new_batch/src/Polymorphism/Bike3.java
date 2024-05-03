package Polymorphism;

public final class Bike3 {
	final int speedlimit=90;
	
	final void run()
	{
//		speedlimit=100;   compile time error
		System.out.println("speelimit: "+speedlimit);
	}
	
//	void run()
//	{
//		System.out.println("speelimit: "+speedlimit);
//	}
}
