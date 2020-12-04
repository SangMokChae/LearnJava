package loopexample;

public class WhileExample2 {
	public static void main(String[] args) {
		int num = 2, sum = 0;
		
		while (num <= 10) {
			sum += num;
			num += 2;
		}
		System.out.println("1부터 10까지 짝수의 합은 " +sum +"입니다");
	}
}
