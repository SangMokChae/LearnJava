package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(br.readLine());
		int revN = 0;
		while(num!=0) {
			int nmg = num%10;
			int mok = num/10;
			num=mok;
			System.out.println("num : " +num);
			System.out.println("������ : " +nmg);
			revN *= 10;
			revN += nmg;
		}
		System.out.println("�ٲ� ����(����) : " +revN);
	}
}
