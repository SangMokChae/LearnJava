package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SwitchCaseTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력
		System.out.print("성적을 입력하세요 : ");
		//변수
		int score = Integer.parseInt(br.readLine());
		char grade = ' ';
		//조건
		switch(score/10) {
		case 10:	
		case 9: grade = 'A';
				break;
		case 8: grade = 'B';
				break;
		case 7: grade = 'C';
				break;
		case 6: grade = 'D';
				break;
		default: grade = 'F';
		}
		//출력
		System.out.println("성적은 " +score +"점 이고, 학점은 " +grade +"입니다.");
		
		String soce = "4";
		
		System.out.println(soce);
	}
}
