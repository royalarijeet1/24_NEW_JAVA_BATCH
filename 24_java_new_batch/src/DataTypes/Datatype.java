package DataTypes;

public class Datatype {
	public static void main(String[] args) {
		Boolean one=false;     //true, false
		byte a=10,b=-20;      //-128 to 127
		char c='c';            //a to z 
		short d=10000,r=-5000;  //-32,768 to 32,767
		int e=100000;   //-2^31 to  ((2^31)-1)
		float f=234.5f;
		long g=100000L; //-2^63  to ((2^63)-1)
		double h=12.3;   
		
		System.out.println("boolean: "+one);
		System.out.println("byte: "+a+" "+b);
		System.out.println("char: "+c);
		System.out.println("short: "+d+" "+r);
		System.out.println("integer: "+e);
		System.out.println("float: "+f);
		System.out.println("long: "+g);
		System.out.println("double: "+h);
	}
}
