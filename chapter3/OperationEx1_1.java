package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationEx1_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("수학 점수를 입력하세요 : ");
		double mathScore = Double.parseDouble(br.readLine());
		System.out.print("국어 점수를 입력하세요 : ");
		double korScore = Double.parseDouble(br.readLine());
		System.out.print("영어 점수를 입력하세요 : ");
		double engScore = Double.parseDouble(br.readLine());
		
		double totalScore = mathScore + korScore + engScore;
		System.out.println("총점 : " +totalScore);
	
		
//		double avgScore = totalScore / 3.0;
//		System.out.println("평균 : " +avgScore);
		System.out.println("평균 : " +(totalScore / 3.0)); 
	}
}
