package loopexample;

public class ForExample2 {
	public static void main(String[] args) {
		String j = "æ»≥Á«œººø‰";
			for (int i = 1; i <= 10; ++i) {
				System.out.print(j +i +(i==10?"":", "));
		}
	}
}
