package ExceptionalHandling;

public class GmailApi {

	public void signup(String email, String password) throws PasswordStrengthException {
		if (password.length()>=3)
		{
			System.out.println("---Successfully signup()--");
		}else {
			throw new PasswordStrengthException("please enter more than 3 alpha numeric value in password");
//			throw new PasswordStrengthException();
		}
	}

	public void login(String email, String password) {
		// TODO Auto-generated method stub
		if(email.contains("@gmail.com"))
		{
			System.out.println("------successfully logged in-----");
		}else
		{
			throw new InvalidEmailException();
		}
		
	}

}
