package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReportCard {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*성적표 계산기*");
		
		//국어
		System.out.print("국어 성적을 입력하세요 : ");
		int korScore = Integer.parseInt(br.readLine());
		
		//영어
		System.out.print("영어 성적을 입력하세요 : ");
		int engScore = Integer.parseInt(br.readLine());
		
		//수학
		System.out.print("수학 성적을 입력하세요 : ");
		int mathScore = Integer.parseInt(br.readLine());
		
		//사회
		System.out.print("사회 성적을 입력하세요 : ");
		int socialScore = Integer.parseInt(br.readLine());
		
		//과학
		System.out.print("과학 성적을 입력하세요 : ");
		int scienceScore = Integer.parseInt(br.readLine());
		
		
		int totalScore = korScore + engScore + mathScore + socialScore + scienceScore;
		System.out.println("총합 : " +totalScore);
		
		System.out.println("평균 : " +(double)totalScore / 5.0);
	}
}
