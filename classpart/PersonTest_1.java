package classpart;

public class PersonTest_1 {
	public static void main(String[] args) {
		PersonTest person = new PersonTest();
		person.age = 28;
		person.name = "bob";
		person.married = false;
		person.babies = 0;
		
		System.out.println("�� ����� �̸��� : " +person.getName());
		System.out.println("�� ����� ���̴� : " +person.getAge());
		System.out.println("�� ����� ��ȥ ���δ� : " +person.isMarried());
		System.out.println("�� ����� �ڳ� ���� : " +person.getBabies());
	}
}
