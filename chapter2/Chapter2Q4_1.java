package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2Q4_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° ���� �Է��ϼ��� (����) : ");
		double a = Double.parseDouble(inbr.readLine());
		System.out.print("�ι�° ���� �Է��ϼ��� (���) : ");
		double b = Double.parseDouble(inbr.readLine());
		System.out.println("*�μ��� ��Ģ����*");
		System.out.println(a +" + " + b +" = " + (double)(a + b));
		System.out.println(a +" - " + b +" = " + (double)(a - b));
		System.out.println(a +" * " + b +" = " + (double)(a * b));
		System.out.println(a +" / " + b +" = " + (double)(a / b));
	}
}