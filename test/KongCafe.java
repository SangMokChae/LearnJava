package test;

public class KongCafe {
	String cafeName;
	int userCount;
	int getMoney;
	
	public KongCafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public void take(int getMoney) {
		this.getMoney += getMoney;
		++userCount;
	}
	
	public void showInfo() {
		System.out.println("Cafe " +cafeName +"��(��) �̿��� ����� " +userCount +"���̰�, ������ " +getMoney +"�Դϴ�.");
	}
}
