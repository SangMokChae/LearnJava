package constructor;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
//		System.out.println(date1.isValid());
		if (date1.isValid()) {
			System.out.println("��ȿ�� ��¥ �Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		}
		MyDate date2 = new MyDate(2, 10, 2006);
		if (date2.isValid()) {
			System.out.println("��ȿ�� ��¥ �Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		}
	}
}
