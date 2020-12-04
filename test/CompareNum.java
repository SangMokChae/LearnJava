package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int fnum = Integer.parseInt(br.readLine());
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int snum = Integer.parseInt(br.readLine());
		
		if (fnum > snum) {
			System.out.println(fnum +"의 값이 " +snum +"의 값보다 큽니다.");
		} else if (fnum < snum) {
			System.out.println(snum +"의 값이 " +snum +"의 값보다 큽니다.");
		}else {
			System.out.println(fnum +"의 값과 " +snum +"의 값이 같습니다.");
		}
	}
}
