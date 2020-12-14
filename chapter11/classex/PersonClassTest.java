package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("classex.Person"); // classex.Person.class;
		
		Constructor[] cons = strClass.getConstructors(); // 생성자
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println(); 
		Field[] fields = strClass.getFields(); // 필드
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		Method[] methods = strClass.getMethods(); // 메소드
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}