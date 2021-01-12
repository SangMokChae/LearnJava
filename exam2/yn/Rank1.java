package yn;

import java.util.ArrayList;

public class Rank1 {
	
	public void rank1(ArrayList<Member> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).getMemberGrade().getBonusPoint() <
						list.get(j).getMemberGrade().getBonusPoint()) {
					list.get(i).rank++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] sum = new int[] {75, 80, 91, 100, 47};
		int[] rank = new int[] {1, 1, 1, 1, 1};
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
			System.out.print(rank[i] +" ");
		}
	}
}
