package loopexample;

public class WhileExample2 {
	public static void main(String[] args) {
		int num = 2, sum = 0;
		
		while (num <= 10) {
			sum += num;
			num += 2;
		}
		System.out.println("1���� 10���� ¦���� ���� " +sum +"�Դϴ�");
	}
}
