package ExceptionalHandling;

import java.io.IOException;

public class InvalidAgeException extends IOException{

	

	public InvalidAgeException(String message) {
		
		super(message);
		System.out.println("--InvalidAgeException(String message)--");
		// TODO Auto-generated constructor stub
	}

	
	
}
