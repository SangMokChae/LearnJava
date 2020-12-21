package exception;

public class PasswordTest {
	private String userPS;

	public String getUserPS() {
		return userPS;
	}

	public void setUserPS(String userPS) throws PasswordException {
		if(userPS == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if (userPS.length() < 6) {
			throw new PasswordException("��й�ȣ�� 6���� �̻� ������");
		}
		else if (userPS.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڸ� ������ �� �����ϴ�.");
		}
		this.userPS = userPS; // else ���� �ش�
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
