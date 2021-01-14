package playGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player {
	Scanner inputWord = new Scanner(System.in);
	List<String> list = new ArrayList();
	
	public String name;
	public String wordin;
	
	public String sayWord() {
		wordin = inputWord.next();
		return wordin;
	}
	
	public boolean succed(char lastChar) {
		if(lastChar == wordin.charAt(0)) {
			list.add(wordin);
			System.out.println(list);
			return true;
		} else {
			return false;
		}
	}
}
