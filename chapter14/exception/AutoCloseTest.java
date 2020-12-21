package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()/*; (리소스를 여러개 생성시킬 경우) */) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
