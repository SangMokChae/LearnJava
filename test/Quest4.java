package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력
		System.out.print("상품의 가격을 입력하세요 : ");
		int product = Integer.parseInt(br.readLine().trim());
		System.out.print("할인율(%)을 입력하세요 : ");
		double discount = Double.parseDouble(br.readLine().trim());
		
		//가격
		double cost = product - (discount*(product/100));
		
		//출력
		System.out.println("상품가격 : " +product +"원");
		System.out.println("할인율(%) : " +discount +"%");
		System.out.println("세일가격 : " +cost +"원");
	}
}