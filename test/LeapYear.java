package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է��ϼ��� : ");
		int leap = Integer.parseInt(br.readLine());
		
			if (leap % 400 == 0) {
				System.out.println("�����Դϴ�.");
			} else if (leap % 4 == 0 && leap % 100 == 0) {
				System.out.println("������ �ƴմϴ�.");
			} else if (leap % 4 == 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("������ �ƴմϴ�.");
			}
		}
	}