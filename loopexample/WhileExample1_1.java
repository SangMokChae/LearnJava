package loopexample;

public class WhileExample1_1 {
	public static void main(String[] args) {
		int num = 0; // num = 1;
		int sum = 0;
		
		while (num < 50) {  //(num <= 50)
			num++;
			sum += num;
			//num++;
		}
		System.out.println("1부터 50까지 합은 " +sum +"입니다.");
	}
}
