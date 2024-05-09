package Encapsulation.B;

import Encapsulation.A.A;
import Encapsulation.A.D;
import Encapsulation.A._Public;

public class C extends D{

	public static void main(String[] args) {
		A a=new A();
		//a.msg();  not accesible because msg() is default and available in the other package
		C c=new C();
		c.msg();
		_Public p=new _Public();
		p.msg();
	}
}
