package yn;

import java.util.ArrayList;

public class Rank {
	
	public void rank(ArrayList<Member> memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			for(int j = 0; j < memberList.size(); j++) {
				if(memberList.get(i).getMemberGrade().getBonusPoint() <
				memberList.get(j).getMemberGrade().getBonusPoint()) { //get(i)까지가 member이다. /getMemberGrade()까지가 MemberGrade이다. /bonusPoint는 이 안에 존재한다.
					memberList.get(i).rank++;
				}
			}
		}
	}
	
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
