package Abstraction;

public class TestBank {
	public static void main(String[] args) {
		Bank s=new SBI();
		Bank p=new PNB();
		
		System.out.println("SBI Rate Of Interest: "+ s.rateOfInterest());
		System.out.println("PNB Rate Of Interest: "+ p.rateOfInterest());
	}
}
