package playGame;

import java.util.Scanner;

public class GameApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String javaWord = "기러기";
		
		System.out.println("게임에 참가하는 인원은 몇명입니까? >>> ");
		int number = scanner.nextInt();
		
		Player[] play = new Player[number];
		
		for(int i = 0; i < number; i++) {
			System.out.println("참가자의 이름을 입력하세요. >>> ");
			play[i] = new Player();
			play[i].name = scanner.next();
		}
		
		System.out.println("처음 시작 단어는 '기러기' 입니다!!");
		
		int i = 0, j = 0;
		while(true) {
			j = i % number;
			int lastIndex = javaWord.length() -1;
			char lastChar = javaWord.charAt(lastIndex);
			
			System.out.println(play[j].name +" >>> ");
			play[j].sayWord();
			boolean continuing = play[j].succed(lastChar);
			if(continuing == false) {
				System.out.println(play[j].name +"이 졌습니다.");
				break;
			}
			javaWord = play[j].wordin;
			i++;
		}
	}
}
