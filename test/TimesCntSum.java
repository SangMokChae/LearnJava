package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimesCntSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("����� �Է��ϼ��� : ");
		int b = Integer.parseInt(br.readLine());
		
		int sum = 0; 
		int cnt = 0;
		
		for (int i = 1; i <= a; i++) {
			if (i % b == 0) {
				cnt++;
				sum = sum + i;
			} 
		}
		System.out.println("1���� �Էµ� ���� " +a +"������ " +b +"�� ����� ����" +cnt);
		System.out.println("1���� �Էµ� ���� " +a +"������ " +b +"�� ����� �հ�" +sum);
	}
}
