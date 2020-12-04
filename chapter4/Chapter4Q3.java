package chapter4;

public class Chapter4Q3 {
	public static void main(String[] args) {
		int dan = 1;
		int times = 1;
		
		for (dan = 1; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				if(dan < times)
					break;
				System.out.println(dan +"X" +times +"=" +(dan * times));
			}
			System.out.println();
		}
	}
}
