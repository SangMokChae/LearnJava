package chapter3;

public class OperationEx2_1 {
	public static void main(String[] args) {
		int gameScore = 150;
		// ++gameScore; �ܵ� ��밡��
		
		int lastScore1 = ++gameScore;
//		System.out.print("���� :: lastScore1 : " +lastScore1);
//		System.out.println(", gameScore : " +gameScore);
		System.out.println("���� :: lastScore1 : " +lastScore1 +", gameScore : " +gameScore);
		
		lastScore1 = gameScore++;
//		System.out.print("���� :: lastScore1 : " +lastScore1);
//		System.out.println(", gameScore : " +gameScore);
		System.out.println("���� :: lastScore1 : " +lastScore1 +", gameScore : " +gameScore);
		
		int lastScore2 = --gameScore;
//		System.out.print("���� :: lastScore2 : " +lastScore2);
//		System.out.println(", gameScore : " +gameScore);
		System.out.println("���� :: lastScore2 : " +lastScore2 +", gameScore : " +gameScore);
		
		lastScore2 = gameScore--;
//		System.out.print("���� :: lastScore2 : " +lastScore2);
//		System.out.println(", gameScore : " +gameScore);
		System.out.println("���� :: lastScore2 : " +lastScore2 +", gameScore : " +gameScore);
	}
}
