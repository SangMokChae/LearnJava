package game;

import java.util.Scanner;

public class Play {
	public String str_beWord = "apple"; // �����ܾ�
	public String str_afWord; // �ֱ� �ܾ�
	
	public void sayWord(String str_Name, int i) {
		System.out.println(str_Name + "> > ");
		Scanner IN3 = new Scanner(System.in);
		str_afWord = IN3.nextLine();
		if(1 >= str_afWord.length()) { //�Է��� �ܾ �Ѵܾ� �̰ų� 2���� ���ϸ� ���ӳ�
			gameOver(str_Name);
		}
	}
	
	public void succeed(String str_Name) { //���ο� �ܾ �޴´�.
		int lastIndex = str_beWord.length() - 1; //������ ���ڿ� ���� �ε���
		char lastChar = str_beWord.charAt(lastIndex); //������ ����
		char firstChar = str_afWord.charAt(0); //ù��° ����
		if (firstChar == lastChar) { //���ܾ��� ù���ڰ� ����� ������ ���ڿ� ������ ��
			str_beWord = str_afWord; // ���� ��� ����
		} else {
			gameOver(str_Name);
		}
	}
	
	public void gameOver(String str_Name) {
		System.out.println(str_Name+"���� �����ϴ�.");
		System.out.println("Game Over!!");
		System.exit(0);
	}
}
