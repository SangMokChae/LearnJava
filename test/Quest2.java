package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//입력
	System.out.print("이름 : ");
	String name = br.readLine();
	System.out.print("학번 : ");
	int classNum = Integer.parseInt(br.readLine().trim());
	System.out.print("토플점수 : ");
	int toeflScore = Integer.parseInt(br.readLine().trim().trim());
	
	//출력
	System.out.println("나의 이름은 " +name +"입니다.");
	System.out.println("학번은 " +classNum +"입니다.");
	System.out.println("그리고 토플 점수는 " +toeflScore +"점 입니다.");
	}
}
