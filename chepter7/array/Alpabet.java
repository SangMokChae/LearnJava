package array;

public class Alpabet {
	public static void main(String[] args) {
		char[][] alp = {{'a','b'},{'c','d'},{'e','f'},{'g','h'},{'i','j'},{'k','l'},{'m','n'},{'o','p'},{'q','r'},{'s','t'},{'u','v'},{'w','x'},{'y','z'}};
		char[][] alp2 = new char [13][2];
		char ch = 'a';
		
		for (int i = 0; i < alp.length; i++) {
			for(int j = 0; j < alp[i].length; j++) {
				System.out.print(alp[i][j]);
			}
			System.out.println();
		}
		

		for (int i = 0; i < alp2.length; i++) {
			for (int j = 0; j < alp2[i].length; j++) {
				alp2[i][j]=ch;
				ch++;
			}
		}
		
		for(int i = 0; i < alp2.length; i++) {
			for (int j = 0; j < alp2[i].length; j++) {
				System.out.print(alp2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (char[] row : alp2) {
			for (char col : row) {
				System.out.print(col +"\t");
			}
			System.out.println();
		}
		
		char a = '¤¡';
		System.out.println((int)a);
	}
}
