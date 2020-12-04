package loopexample;

public class NestedLoopWhile {
	public static void main(String[] args) {
		int dan = 2;
		while(dan<=9) {
			int times = 1;
			while(times <= 9) {
				System.out.println(dan +"X" +times +"=" +(dan * times));
				times++;
			}
			System.out.println();
			dan++;
		}
	}
}