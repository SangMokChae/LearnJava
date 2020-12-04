package chapter3;

public class OperationEx1_2 {
	public static void main(String[] args) {
		int marthScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = marthScore + engScore;
		System.out.println(totalScore);
//		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
		
		int totalScore2 = marthScore + engScore + korScore;
		System.out.println(totalScore2);
		
		double avgScore2 = totalScore / 3.0;
		System.out.println(avgScore2);
		
		System.out.println((double)totalScore / 3.0);
		
	}
}
