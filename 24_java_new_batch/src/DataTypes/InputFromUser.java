package DataTypes;


import java.util.*;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean one;     //true, false
		byte a;      //-128 to 127
		char c;            //a to z 
		short d;  //-32,768 to 32,767
		int e;   //-2^31 to  ((2^31)-1)
		float f;
		long g; //-2^63  to ((2^63)-1)
		double h;   
		
		System.out.println("enter boolean value:");
		one=sc.nextBoolean();
		System.out.println("enter byte value:");
		a=sc.nextByte();
		System.out.println("enter character value:");
		c=sc.next().charAt(0);
		System.out.println("enter short value:");
		d=sc.nextShort();
		System.out.println("enter integer value:");
		e=sc.nextInt();
		System.out.println("enter float value:");
		f=sc.nextFloat();
		System.out.println("enter long value:");
		g=sc.nextLong();
		System.out.println("enter double value:");
		h=sc.nextDouble();
		
		System.out.println("boolean: "+one);
		System.out.println("byte: "+a);
		System.out.println("char: "+c);
		System.out.println("short: "+d);
		System.out.println("integer: "+e);
		System.out.println("float: "+f);
		System.out.println("long: "+g);
		System.out.println("double: "+h);

	}
}
