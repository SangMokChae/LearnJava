package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationEx1_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ������ �Է��ϼ��� : ");
		double mathScore = Double.parseDouble(br.readLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
		double korScore = Double.parseDouble(br.readLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
		double engScore = Double.parseDouble(br.readLine());
		
		double totalScore = mathScore + korScore + engScore;
		System.out.println("���� : " +totalScore);
	
		
//		double avgScore = totalScore / 3.0;
//		System.out.println("��� : " +avgScore);
		System.out.println("��� : " +(totalScore / 3.0)); 
	}
}
