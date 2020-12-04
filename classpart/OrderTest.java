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
		order.ordDay = "2018년 3월 12일";
		order.ordName = "홍길순";
		order.productNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " +order.getOrdNum());
		System.out.println("주문자 아이디 : " +order.getOrdID());
		System.out.println("주문 날짜 : " +order.getOrdDay());
		System.out.println("주문자 이름 : " +order.getOrdName());
		System.out.println("주문 상품 번호 : " +order.getProductNum());
		System.out.println("배송 주소 : " +order.getAddress());
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
