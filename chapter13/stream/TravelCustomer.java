package stream;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) { // default생성자가 없기 때문에 setMethod를 만들지 않고 이걸로 값을 받음
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	public String toString() { // 객체 출력시 String값으로 출력
		return "name: " +name +"age: " +age +"price: " +price;
	}
}
