package chapter7;

public class Chapter7Q3 {
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for (int i = 1, j = 0; i < 11; i++) {
			if (i % 2 == 0) {
				num[j] = i;
				j++;
			}
//			if(j==num.length) break;
		}
		
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		System.out.println("гу╟Х : " +sum);
	}
}
