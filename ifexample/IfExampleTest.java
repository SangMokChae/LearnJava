package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExampleTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//성적입력
		System.out.print("성적을 입력하세요 : ");
		//변수
		int score = Integer.parseInt(br.readLine());
		char grade;
		//조건		
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
		//출력
		System.out.println("당신의 성적은 : " +grade);
	}
}
