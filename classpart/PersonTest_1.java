package classpart;

public class PersonTest_1 {
	public static void main(String[] args) {
		PersonTest person = new PersonTest();
		person.age = 28;
		person.name = "bob";
		person.married = false;
		person.babies = 0;
		
		System.out.println("이 사람의 이름은 : " +person.getName());
		System.out.println("이 사람의 나이는 : " +person.getAge());
		System.out.println("이 사람의 결혼 여부는 : " +person.isMarried());
		System.out.println("이 사람의 자녀 수는 : " +person.getBabies());
	}
}
