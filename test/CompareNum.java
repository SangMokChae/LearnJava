package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int fnum = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int snum = Integer.parseInt(br.readLine());
		
		if (fnum > snum) {
			System.out.println(fnum +"�� ���� " +snum +"�� ������ Ů�ϴ�.");
		} else if (fnum < snum) {
			System.out.println(snum +"�� ���� " +snum +"�� ������ Ů�ϴ�.");
		}else {
			System.out.println(fnum +"�� ���� " +snum +"�� ���� �����ϴ�.");
		}
	}
}
