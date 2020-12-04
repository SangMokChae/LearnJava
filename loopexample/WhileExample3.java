package loopexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExample3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("합계를 구할 배수를 입력하세요 : ");
		int n = Integer.parseInt(br.readLine());
		int num = 1;
		int sum = 0;
		
		while (num <= 50) {
			if (num % n == 0)
			sum += num;
			num++;
		}
			System.out.println("1부터 50까지의 " +n+ "의 배수의 합은 : " +sum);
	}
}
