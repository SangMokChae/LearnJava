package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신"); //customer class로 생성
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 10000); //vipcustomer 로 class 생성
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신"); // set 이랑 show가 없어도 상속 받았기 때문에 사용가능하다.
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
