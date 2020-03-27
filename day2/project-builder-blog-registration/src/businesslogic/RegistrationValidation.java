package businesslogic;

public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		RegistrationValidation a=new RegistrationValidation();
		a.validEmail(email);
		a.validPassword(password, confirmPassword);
		return false;
		
	}
	private boolean validPassword(String password, String confirmPassword) {
		if(!password.isEmpty() && (password==confirmPassword) && (password.length()>=8) && (password.length()<=20))
			return true;
		else {
		return false;
		}
	}
	private boolean validEmail(String email) {
		if(email.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}")) {
			return true;
		}
		else
		{
		return false;
		}
	}
}
