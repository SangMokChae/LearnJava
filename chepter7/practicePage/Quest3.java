package practicePage;

public class Quest3 {
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for(int i = 1, j = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				num[j] = i;
				j++;
			}
		}
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		System.out.println("гу╟Х : " +sum);
	}	
}
