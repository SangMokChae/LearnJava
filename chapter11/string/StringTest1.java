package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		//���� �ٸ� �ּ��� ��ü�� �����Ѵ�.
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); //���ڿ������� equals�� ����Ͽ� �� �񱳸� �Ѵ�.
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3=str3+str4); // �ٸ� �ּҸ� ������ /���� �ٸ��ϱ�! - abcabc��� ���ο� ���� ���� str3�� �����Ѵ�. - ������ str3�� ������� �����ϸ� ���߿� �������.(garbage)
	}
}
