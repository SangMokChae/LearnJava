package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javastr 문자열 주소 : " +System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " +System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소 : " +System.identityHashCode(buffer)); //append를 사용하면 값을 변경하는게 아니라 기존의 값에 뒤의 문장을 추가하는 형식으로 이어진다.
		
		javaStr = buffer.toString(); //문자열로 형변환시킴 값을 String으로 바꿈으로써 값이 변경된다.
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 : " +System.identityHashCode(javaStr));
		
		System.out.println("buffer 문자열 반전: " +buffer.reverse()); //값 반전
	}
}
