package constructor;

public class PhoneBook {
	
	public static void main(String[] args) {
		PhoneBook pb1 = new PhoneBook("이순신", "010-2111-0222", "부산");
		PhoneBook pb2 = new PhoneBook();
		
		pb2.setName("김유신");
		pb2.setPhoneNum("010-7010-1010");
		pb2.setAddress("서울");
		
		pb1.showInfo();
		System.out.println();
		pb2.showInfo();
	}
	
	
	private void showInfo() {
		System.out.println("이름 : " +getName());
		System.out.println("전화번호 : " +getPhoneNum());
		System.out.println("주소 : " +getAddress());
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
