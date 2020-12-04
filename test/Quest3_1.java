package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest3_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("»ï°¢ÇüÀÇ ¹Øº¯ : ");
		int trWidth = Integer.parseInt(br.readLine().trim());
		System.out.println("»ï°¢ÇüÀÇ ³ôÀÌ : ");
		int trHeight = Integer.parseInt(br.readLine().trim());
		
		double result = trWidth * trHeight / 2;
		
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ´Â? : " +result);
	}
}
