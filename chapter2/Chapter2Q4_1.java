package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2Q4_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 값을 입력하세요 (정수) : ");
		double a = Double.parseDouble(inbr.readLine());
		System.out.print("두번째 값을 입력하세요 (상수) : ");
		double b = Double.parseDouble(inbr.readLine());
		System.out.println("*두수의 사칙연산*");
		System.out.println(a +" + " + b +" = " + (double)(a + b));
		System.out.println(a +" - " + b +" = " + (double)(a - b));
		System.out.println(a +" * " + b +" = " + (double)(a * b));
		System.out.println(a +" / " + b +" = " + (double)(a / b));
	}
}