package constructor;

public class PhoneBook {
	
	public static void main(String[] args) {
		PhoneBook pb1 = new PhoneBook("�̼���", "010-2111-0222", "�λ�");
		PhoneBook pb2 = new PhoneBook();
		
		pb2.setName("������");
		pb2.setPhoneNum("010-7010-1010");
		pb2.setAddress("����");
		
		pb1.showInfo();
		System.out.println();
		pb2.showInfo();
	}
	
	
	private void showInfo() {
		System.out.println("�̸� : " +getName());
		System.out.println("��ȭ��ȣ : " +getPhoneNum());
		System.out.println("�ּ� : " +getAddress());
	}

	private String name;
	private String phoneNum;
	private String address;
	
	public PhoneBook(String name, String phoneNum, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public PhoneBook() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
