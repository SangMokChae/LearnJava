package hiding;

public class MyDate {
	private int day = 1;
	public int month;
	public int year;
	
	public void getDate() {
		System.out.println(year +"��" +month +"��" +day +"��");
	}
	
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("��ȿ�� ��¥�Դϴ�.");
				this.day = day;
			}
		}
	}
}
