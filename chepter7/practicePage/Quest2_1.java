package practicePage;

public class Quest2_1 {
	public static void main(String[] args) {
		char[] alp = new char[26];
		char ch = 'a';
		
		for (int i = 0; i < alp.length; i++, ch++) {
			alp[i] = ch;
		}
		
		for (int i = 0; i < alp.length; i++) {
			System.out.println((char)((int)alp[i] - 32));
		}
	}
}
