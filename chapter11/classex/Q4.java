package classex;

class MyDog {
	
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() { // toString�� ������Ʈ���� �����ϴ� method
		return type +" " +name; // = "������" +" " +"�۸���"
	}
}

public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("�۸���", "������");
		System.out.println(dog); // dog = dog.toString();
	}
}
