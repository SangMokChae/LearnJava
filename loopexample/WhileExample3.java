package loopexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExample3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�հ踦 ���� ����� �Է��ϼ��� : ");
		int n = Integer.parseInt(br.readLine());
		int num = 1;
		int sum = 0;
		
		while (num <= 50) {
			if (num % n == 0)
			sum += num;
			num++;
		}
			System.out.println("1���� 50������ " +n+ "�� ����� ���� : " +sum);
	}
}
