package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteLoop {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("두 값을 입력하세요 : ");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int multiple = a*b;
			System.out.println("두 값의 곱은 : " +multiple);
			if (multiple > 500) {
				System.out.println("두 값의 곱이 500을 초과했습니다.");
				break;
			}
		}
	}
}
