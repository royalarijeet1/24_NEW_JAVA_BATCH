package ExceptionalHandling;

public class InvalidEmailException extends RuntimeException{
	public InvalidEmailException() {
		super("Invalid Email");
	}
}
