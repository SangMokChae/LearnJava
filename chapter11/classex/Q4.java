package classex;

class MyDog {
	
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() { // toString은 오브젝트에서 제공하는 method
		return type +" " +name; // = "진돗개" +" " +"멍멍이"
	}
}

public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog); // dog = dog.toString();
	}
}
