package string;

public class StringTest2 {

	public static void main(String[] args) {
	String javaStr = new String("java");
	String androidStr = new String("android");
	System.out.println(javaStr);
	System.out.println("처음 문자열 주소 값: " +System.identityHashCode(javaStr));
	
	javaStr = javaStr.concat(androidStr);
	
	System.out.println(javaStr);
	System.out.println("연결된 문자열 주소 값: " +System.identityHashCode(javaStr)); //System.identityHashCode를 사용하여 실제 메모리값을 출력할수 있게 된다.
	
	String a = "java";
	System.out.println("연결된 문자열 주소 값: " +System.identityHashCode(a));
	a = a.concat(androidStr);
	System.out.println("연결된 문자열 주소 값: " +System.identityHashCode(a));
	String b = "java";
	System.out.println("연결된 문자열 주소 값: " +System.identityHashCode(b));
	
	javaStr = javaStr.concat("hi");
	System.out.println(javaStr); //concat 은 문자열을 이어서 합쳐주는 것이다 add같은것
	}
}
