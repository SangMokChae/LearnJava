package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�Է�
		System.out.print("��ǰ�� ������ �Է��ϼ��� : ");
		int product = Integer.parseInt(br.readLine().trim());
		System.out.print("������(%)�� �Է��ϼ��� : ");
		double discount = Double.parseDouble(br.readLine().trim());
		
		//����
		double cost = product - (discount*(product/100));
		
		//���
		System.out.println("��ǰ���� : " +product +"��");
		System.out.println("������(%) : " +discount +"%");
		System.out.println("���ϰ��� : " +cost +"��");
	}
}