package stream;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) { // default�����ڰ� ���� ������ setMethod�� ������ �ʰ� �̰ɷ� ���� ����
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

	public String toString() { // ��ü ��½� String������ ���
		return "name: " +name +"age: " +age +"price: " +price;
	}
}
