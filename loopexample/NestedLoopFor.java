package loopexample;

public class NestedLoopFor {
	public static void main(String[] args) {
		int dan;
		int times;
		for (times = 1; times <= 9; times++) {
			for(dan = 3; dan <= 7; dan++) {
				System.out.print(dan +"X" +times +"=" +(dan * times +"\t"));
			}
			System.out.println();
		}
	}
}
