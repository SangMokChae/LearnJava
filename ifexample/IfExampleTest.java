package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExampleTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�����Է�
		System.out.print("������ �Է��ϼ��� : ");
		//����
		int score = Integer.parseInt(br.readLine());
		char grade;
		//����		
		if (90 <= score && score <= 100) {
			grade = 'A';
		} else if (80 <= score && score <= 89) {
			grade = 'B';
		} else if (70 <= score && score <= 79) {
			grade = 'C';
		} else if (60 <= score && score <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		//���
		System.out.println("����� ������ : " +grade);
	}
}
