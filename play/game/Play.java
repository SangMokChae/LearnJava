package game;

import java.util.Scanner;

public class Play {
	public String str_beWord = "apple"; // 이전단어
	public String str_afWord; // 최근 단어
	
	public void sayWord(String str_Name, int i) {
		System.out.println(str_Name + "> > ");
		Scanner IN3 = new Scanner(System.in);
		str_afWord = IN3.nextLine();
		if(1 >= str_afWord.length()) { //입력한 단어가 한단어 이거나 2글자 이하면 게임끝
			gameOver(str_Name);
		}
	}
	
	public void succeed(String str_Name) { //새로운 단어를 받는다.
		int lastIndex = str_beWord.length() - 1; //마지막 문자에 대한 인덱스
		char lastChar = str_beWord.charAt(lastIndex); //마지막 문자
		char firstChar = str_afWord.charAt(0); //첫번째 문자
		if (firstChar == lastChar) { //새단어의 첫글자가 저장된 마지막 문자와 같은지 비교
			str_beWord = str_afWord; // 같은 경우 실행
		} else {
			gameOver(str_Name);
		}
	}
	
	public void gameOver(String str_Name) {
		System.out.println(str_Name+"님이 졌습니다.");
		System.out.println("Game Over!!");
		System.exit(0);
	}
}
