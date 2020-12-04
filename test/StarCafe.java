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
		System.out.println("Cafe " +cafeName +"을(를) 이용한 사람은 " +userCount +"명이고, 수입은 " +getMoney +"입니다.");
	}
}
