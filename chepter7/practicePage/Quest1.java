package practicePage;

public class Quest1 {
	public static void main(String[] args) {
		int[] x = new int[20];
		int sum = 0;
		
		for (int i = 1; i < x.length; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println(i +" ");
				sum += i;
			}
		}
		System.out.println("1���� 20������ ���� �߿� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ : " +sum);
	}
}
