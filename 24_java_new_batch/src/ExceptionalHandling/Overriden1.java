package ExceptionalHandling;

import java.io.IOException;

//if parent class doesnot have exception
public class Overriden1 extends Parent1{
//	void msg() throws IOException{           complie time error
//		System.out.println("text exception");
//	}
	static void msg() throws ArrayIndexOutOfBoundsException{
		System.out.println("text exception");
	}
	
	public static void main(String[] args) {
		Overriden1.msg();
	}
}
