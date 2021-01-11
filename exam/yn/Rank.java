package yn;

public class Rank {
	public static void main(String[] args) {
		int[] sum = {75, 80, 91, 100, 47};
		int[] rank = {1, 1, 1, 1, 1}; 
//		int[] sum = new int[] {75, 80, 91, 100, 47};
//		int[] rank = new int[] {1, 1, 1, 1, 1};
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
			System.out.print(rank[i]+" ");
		}
//		for(int i = 0; i < rank.length; i++) {
//			System.out.print(rank[i]);
//		}
	}
}
