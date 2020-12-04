package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2OtherThings {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("who are you? : ");
		String a = br.readLine();
		System.out.print("How old are you? : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("how many do you have keys? : ");
		int c = Integer.parseInt(br.readLine());
		
		System.out.println("*Information*");
		System.out.println("(s)he is " +a +" " +(int)b +" years old");
		System.out.println("(s)he has " +(int)c +" key(s)!");
	}
}