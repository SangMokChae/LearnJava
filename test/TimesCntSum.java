package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimesCntSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자를 입력하세요 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("배수를 입력하세요 : ");
		int b = Integer.parseInt(br.readLine());
		
		int sum = 0; 
		int cnt = 0;
		
		for (int i = 1; i <= a; i++) {
			if (i % b == 0) {
				cnt++;
				sum = sum + i;
			} 
		}
		System.out.println("1부터 입력된 정수 " +a +"까지의 " +b +"의 배수의 갯수" +cnt);
		System.out.println("1부터 입력된 정수 " +a +"까지의 " +b +"의 배수의 합계" +sum);
	}
}
