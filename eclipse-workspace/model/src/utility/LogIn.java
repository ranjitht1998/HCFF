package utility;

public class LogIn {
		public boolean login(String username,String password)
		{
			if(username.length()>4 && password.length()>4)  {
				return true;
			}
			else
			{
				return false;
				
			}
		}

}
