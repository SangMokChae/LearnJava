package constructor;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
//		System.out.println(date1.isValid());
		if (date1.isValid()) {
			System.out.println("유효한 날짜 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
		MyDate date2 = new MyDate(2, 10, 2006);
		if (date2.isValid()) {
			System.out.println("유효한 날짜 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
}
