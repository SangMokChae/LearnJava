package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("연도를 입력하세요 : ");
		int leap = Integer.parseInt(br.readLine());
		
			if (leap % 400 == 0) {
				System.out.println("윤년입니다.");
			} else if (leap % 4 == 0 && leap % 100 == 0) {
				System.out.println("윤년이 아닙니다.");
			} else if (leap % 4 == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("윤년이 아닙니다.");
			}
		}
	}