package ifexample;

public class IfExample2_1 {
	public static void main(String[] args) {
		int age = 7;
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		} 
		if (9 <= age && age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		} 
		if (15 <= age && age < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		} 
		if (21 <= age && age < 60) {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		if (age >= 60) {
			charge = 0;
			System.out.println("��ο���Դϴ�.");
		}
		System.out.println("������ " +charge +"�� �Դϴ�.");
	}
}
