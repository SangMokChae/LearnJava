package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SumOfBetweenNums {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int b = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int cnt = 0;
		
		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = a; i <= b; i++) {
			sum = sum + i;
			cnt++;
		}
			System.out.println("�� �� ������ ���� ������ : " +cnt);
			System.out.println("�� ���� �հ�� : " +sum);
		}
	}

