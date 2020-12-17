package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		// 추상메소드 - 외부사용 가능
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		// 람다식 - 일회용
		StringConcat concat2 = (s, v) -> System.out.println(s +"," +v);
		concat2.makeString(s1, s2);
		
		// 익명생성 - 일회용
		StringConcat concat3 = new StringConcat() {
			public void makeString(String s1, String s2) {
				System.out.println(s1 +"," +s2);
			}
		};
		concat3.makeString(s1, s2);
	}
}
