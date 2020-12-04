package classpart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FunctionTest_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		int sum = add(num1, num2);
		System.out.println(num1 +" + " +num2 +" = " +sum +"입니다.");
		int min = min(num1, num2);
		System.out.println(num1 +" - " +num2 +" = " +min +"입니다.");
		int mlp = mlp(num1, num2);
		System.out.println(num1 +" * " +num2 +" = " +mlp +"입니다.");
		double div = div(num1, num2);
		System.out.println(num1 +" / " +num2 +" = " +div +"입니다.");
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int min(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int mlp(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static int div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
}
