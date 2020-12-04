package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SumOfBetweenNums {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 숫자를 입력하세요 : ");
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
			System.out.println("두 수 사이의 숫자 갯수는 : " +cnt);
			System.out.println("두 수의 합계는 : " +sum);
		}
	}

