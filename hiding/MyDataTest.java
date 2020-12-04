package hiding;

public class MyDataTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.month = 2;
		date.setDay(25);
		date.year = 2018;
		date.getDate();
	}
}
