package utility;

public class AdminValidation {
	 
	public boolean Validate(String username,String password,String confirmpassword){
		if(username.length()>4 &&password.contentEquals(confirmpassword))
		{
			return true;
		}
		else
			return false;
	}
}
