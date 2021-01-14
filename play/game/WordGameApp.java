package game;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		Play p = new Play();
		
		Scanner IN1 = new Scanner(System.in);
		System.out.println("게임에 참가하는 인원은 몇명입니까>> ");
		int int_PlayerNum = IN1.nextInt();
		Scanner IN2 = new Scanner(System.in);
		String str_Name[] = new String[int_PlayerNum];
		
		for(int i = 0; i < int_PlayerNum; i++) {
			System.out.println("참가자의 이름을 입력하세요 > >");
			String str_ramName = IN2.nextLine();
			str_Name[i] = str_ramName;
		}
		
		System.out.println("자바 >>" +p.str_beWord);
		for(int j = 0;;j++) {
			p.sayWord(str_Name[j], j);
			p.succeed(str_Name[j]);
			if(j==int_PlayerNum-1) {
				j= -1;
			}
		}
	}

}
