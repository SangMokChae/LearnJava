package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���"); //customer class�� ����
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 10000); //vipcustomer �� class ����
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������"); // set �̶� show�� ��� ��� �޾ұ� ������ ��밡���ϴ�.
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
