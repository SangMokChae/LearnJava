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
		System.out.println(texiNumber +"�� �°��� " +passengerCount +"���̰�, ������ " +money +"�Դϴ�.");
	}
}
