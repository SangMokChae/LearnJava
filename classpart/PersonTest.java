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
		
		System.out.println("이 사람의 나이 : " +person.getAge() +"살 입니다.");
		System.out.println("이 사람의 이름 : " +person.getName() +" 입니다.");
		System.out.println("이 사람의 결혼 여부 : " +person.isMarried());
		System.out.println("이 사람의 나이 : " +person.getBabies() +"명 입니다.");
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
