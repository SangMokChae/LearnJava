package string;

public class StringTest2 {

	public static void main(String[] args) {
	String javaStr = new String("java");
	String androidStr = new String("android");
	System.out.println(javaStr);
	System.out.println("ó�� ���ڿ� �ּ� ��: " +System.identityHashCode(javaStr));
	
	javaStr = javaStr.concat(androidStr);
	
	System.out.println(javaStr);
	System.out.println("����� ���ڿ� �ּ� ��: " +System.identityHashCode(javaStr)); //System.identityHashCode�� ����Ͽ� ���� �޸𸮰��� ����Ҽ� �ְ� �ȴ�.
	
	String a = "java";
	System.out.println("����� ���ڿ� �ּ� ��: " +System.identityHashCode(a));
	a = a.concat(androidStr);
	System.out.println("����� ���ڿ� �ּ� ��: " +System.identityHashCode(a));
	String b = "java";
	System.out.println("����� ���ڿ� �ּ� ��: " +System.identityHashCode(b));
	
	javaStr = javaStr.concat("hi");
	System.out.println(javaStr); //concat �� ���ڿ��� �̾ �����ִ� ���̴� add������
	}
}
