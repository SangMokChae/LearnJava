package classex;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person"); //class의 이름을 호출하는 형식 클래스의 이름이 다른경우 오류 발생
		System.out.println(pClass3.getName());
	}

}
