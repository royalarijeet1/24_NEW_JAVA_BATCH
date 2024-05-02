package Polymorphism;

public class BankApp {
	public static void main(String[] args) {
		SBIBank s=new SBIBank();
		ICICBank i=new ICICBank();
		AXISBank a=new AXISBank();
		
		System.out.println("SBI Rate Of Interest: "+s.getRateOfInterest());
		System.out.println("ICIC Rate Of Interest: "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest:"+a.getRateOfInterest());
	}
}
