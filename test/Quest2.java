package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//�Է�
	System.out.print("�̸� : ");
	String name = br.readLine();
	System.out.print("�й� : ");
	int classNum = Integer.parseInt(br.readLine().trim());
	System.out.print("�������� : ");
	int toeflScore = Integer.parseInt(br.readLine().trim().trim());
	
	//���
	System.out.println("���� �̸��� " +name +"�Դϴ�.");
	System.out.println("�й��� " +classNum +"�Դϴ�.");
	System.out.println("�׸��� ���� ������ " +toeflScore +"�� �Դϴ�.");
	}
}
