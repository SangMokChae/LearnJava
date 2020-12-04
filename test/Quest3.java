package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//반지름(정수) 입력
		System.out.print("반지름을 입력하세요 : ");
		int r = Integer.parseInt(br.readLine().trim());
		
		// 상수변수 파이와 원주율 공식
		final double pi = 3.14159;
		double result = 2*pi*r;
		
		//값
		System.out.println("반지름은 " +r +", 이고 원주는 " +result +"입니다.");
	}
}
