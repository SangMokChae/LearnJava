package classpart;

public class PersonTest {
	int age;
	String name;
	boolean married;
	int babies;
	
	public static void main(String[] args) {
		PersonTest person = new PersonTest();
		person.age = 40;
		person.name = "James";
		person.married = true;
		person.babies = 3;
		
		System.out.println("�� ����� ���� : " +person.getAge() +"�� �Դϴ�.");
		System.out.println("�� ����� �̸� : " +person.getName() +" �Դϴ�.");
		System.out.println("�� ����� ��ȥ ���� : " +person.isMarried());
		System.out.println("�� ����� ���� : " +person.getBabies() +"�� �Դϴ�.");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getBabies() {
		return babies;
	}
	public void setBabies(int babies) {
		this.babies = babies;
	}
}
