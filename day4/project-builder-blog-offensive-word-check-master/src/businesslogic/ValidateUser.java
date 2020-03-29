package businesslogic;


//class validate user
public class ValidateUser {


	public boolean validate(String email, String password) {
		
	
		if(email.equals("admin") && password.equals("admin"))
			return true;
		else 
			return false;
	}

}
