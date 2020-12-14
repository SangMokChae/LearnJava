package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		//각각 다른 주소의 객체를 생성한다.
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); //문자열에서는 equals를 사용하여 값 비교를 한다.
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3=str3+str4); // 다른 주소를 가진다 /값이 다르니깐! - abcabc라는 새로운 값을 가진 str3를 생성한다. - 이전의 str3는 상속위에 존재하며 나중에 사라진다.(garbage)
	}
}
