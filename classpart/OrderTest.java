package classpart;

public class OrderTest {
	long ordNum;
	String ordID;
	String ordDay;
	String ordName;
	String productNum;
	String address;
	
	public static void main(String[] args) {
		OrderTest order = new OrderTest();
		order.ordNum = 201803120001l;
		order.ordID = "abc123";
		order.ordDay = "2018�� 3�� 12��";
		order.ordName = "ȫ���";
		order.productNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " +order.getOrdNum());
		System.out.println("�ֹ��� ���̵� : " +order.getOrdID());
		System.out.println("�ֹ� ��¥ : " +order.getOrdDay());
		System.out.println("�ֹ��� �̸� : " +order.getOrdName());
		System.out.println("�ֹ� ��ǰ ��ȣ : " +order.getProductNum());
		System.out.println("��� �ּ� : " +order.getAddress());
	}

	public long getOrdNum() {
		return ordNum;
	}

	public void setOrdNum(long ordNum) {
		this.ordNum = ordNum;
	}

	public String getOrdID() {
		return ordID;
	}

	public void setOrdID(String ordID) {
		this.ordID = ordID;
	}

	public String getOrdDay() {
		return ordDay;
	}

	public void setOrdDay(String ordDay) {
		this.ordDay = ordDay;
	}

	public String getOrdName() {
		return ordName;
	}

	public void setOrdName(String ordName) {
		this.ordName = ordName;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
