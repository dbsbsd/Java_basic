package etc.exception.custom;

public class loginValidateException extends Exception{

	// 기본 생성자
	public loginValidateException() {
	
	}
	
	// 커스텀 에러 메세지를 받는 생성자
	public loginValidateException(String message) {
		super(message);
	}
	
}
