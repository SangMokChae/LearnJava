package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteLoop {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("�� ���� �Է��ϼ��� : ");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int multiple = a*b;
			System.out.println("�� ���� ���� : " +multiple);
			if (multiple > 500) {
				System.out.println("�� ���� ���� 500�� �ʰ��߽��ϴ�.");
				break;
			}
		}
	}
}
