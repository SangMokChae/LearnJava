package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4Q4_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하세요 : ");
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= size; i++) {
			for (int j = 1; j < i + size; j++) {
				if(size - i >= j) {
					System.out.print(" ");
			} else {
					System.out.print("*");
			}		
		}
			System.out.println();
		}
	}
}