package test;

public class StarCafe {
	String cafeName;
	int getMoney;
	int userCount;
	
	public StarCafe(String cafeName) {
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
