package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chapter4Q1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		char operator = (char) br.read();
		
		int num1 = 10;
		int num2 = 2;
		
		if (operator == '+') {
			System.out.println(num1 +"+" +num2 +"=" +(num1+num2));
//			System.out.println(num1 +String.valueOf(operator) +num2 +"=" +(num1+num2));
		} else if (operator == '-') {
			System.out.println(num1 +"-" +num2 +"=" +(num1-num2));
		} else if (operator == '*') {
			System.out.println(num1 +"*" +num2 +"=" +(num1*num2));
		} else if (operator == '/') {
			System.out.println(num1 +"/" +num2 +"=" +(num1/num2));
		} else {
			System.out.println("����Ұ��� ������ �Դϴ�.");
		}
	}
}