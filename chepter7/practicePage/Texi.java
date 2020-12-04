package practicePage;

public class Texi {
	int texiNumber;
	int passengerCount;
	int money;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(texiNumber +"의 승객은 " +passengerCount +"명이고, 수입은 " +money +"입니다.");
	}
}
