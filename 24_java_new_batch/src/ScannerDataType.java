import java.util.*;

public class ScannerDataType {
	public static void main(String[] args) {
		
		int a;
		float b;
		char c;
		long d;
		byte e;
		double f;
		short g;
		boolean h;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the value for int a:");
		a=sc.nextInt();
		
		System.out.println("enter the value for float b:");
		b=sc.nextFloat();
		
		System.out.println("enter the value for char c:");
		c=sc.next().charAt(0);
		
		System.out.println("enter the value for long d:");
		d=sc.nextLong();
		
		System.out.println("enter the value for byte e:");
		e=sc.nextByte();
		
		System.out.println("enter the value for double f:");
		f=sc.nextDouble();
		
		System.out.println("enter the value for short g:");
		g=sc.nextShort();
		
		System.out.println("enter the value for boolean h:");
		h=sc.nextBoolean();
		
		
		System.out.println("int a "+a);
		System.out.println("float b "+b);
		System.out.println("char c "+c);
		System.out.println("long d "+d);
		System.out.println("byte e "+e);
		System.out.println("double f "+f);
		System.out.println("short g "+g);
		System.out.println("boolean h "+h);
	}
}
