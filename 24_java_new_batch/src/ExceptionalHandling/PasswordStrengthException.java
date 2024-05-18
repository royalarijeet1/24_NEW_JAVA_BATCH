package ExceptionalHandling;

public class PasswordStrengthException extends Exception{
	public PasswordStrengthException()
	{
		super("please provide Strong Password");
	}
	public PasswordStrengthException(String msg)
	{
		super(msg);
	}
}
