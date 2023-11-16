package etc.exception.custom;

import javax.security.auth.login.LoginException;

public class MainClass {

	public static void main(String[] args){
		
		LoginUser user = new LoginUser("abc", "1234");
		
		String result;
		try {
			result = user.loginValidate("abc", "1234");
			System.out.println(result);
		} catch (loginValidateException e) {
			System.out.println(e.getMessage());
		}
	}

}
