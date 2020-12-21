package exception;

public class PasswordTest {
	private String userPS;

	public String getUserPS() {
		return userPS;
	}

	public void setUserPS(String userPS) throws PasswordException {
		if(userPS == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if (userPS.length() < 6) {
			throw new PasswordException("비밀번호는 6글자 이상 쓰세요");
		}
		else if (userPS.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자만 구성할 수 없습니다.");
		}
		this.userPS = userPS; // else 값에 해당
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String userPS = null;
		try {
			test.setUserPS(userPS);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		userPS = "12345";
		try {
			test.setUserPS(userPS);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPS = "fdafda";
		try {
			test.setUserPS(userPS);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
