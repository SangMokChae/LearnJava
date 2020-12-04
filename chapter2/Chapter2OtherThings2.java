package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2OtherThings2{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("what's your name? : ");
		String a = br.readLine();
		System.out.println("how old are you? : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("where are you from? : ");
		String c = br.readLine();
		System.out.println("what's your fav_number? : ");
		int d = Integer.parseInt(br.readLine());
		
		System.out.println("(s)he is name is " +a +", " +b +" years old now, " +a +" living in " +c +" and (s)he likes number " +d);
	}
}