package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReportCard {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*����ǥ ����*");
		
		//����
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korScore = Integer.parseInt(br.readLine());
		
		//����
		System.out.print("���� ������ �Է��ϼ��� : ");
		int engScore = Integer.parseInt(br.readLine());
		
		//����
		System.out.print("���� ������ �Է��ϼ��� : ");
		int mathScore = Integer.parseInt(br.readLine());
		
		//��ȸ
		System.out.print("��ȸ ������ �Է��ϼ��� : ");
		int socialScore = Integer.parseInt(br.readLine());
		
		//����
		System.out.print("���� ������ �Է��ϼ��� : ");
		int scienceScore = Integer.parseInt(br.readLine());
		
		
		int totalScore = korScore + engScore + mathScore + socialScore + scienceScore;
		System.out.println("���� : " +totalScore);
		
		System.out.println("��� : " +(double)totalScore / 5.0);
	}
}
