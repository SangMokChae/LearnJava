package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//������(����) �Է�
		System.out.print("�������� �Է��ϼ��� : ");
		int r = Integer.parseInt(br.readLine().trim());
		
		// ������� ���̿� ������ ����
		final double pi = 3.14159;
		double result = 2*pi*r;
		
		//��
		System.out.println("�������� " +r +", �̰� ���ִ� " +result +"�Դϴ�.");
	}
}
