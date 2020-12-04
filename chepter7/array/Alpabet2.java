package array;

public class Alpabet2 {
	public static void main(String[] args) {
		char[][] apl = new char [20][5];
		char ch = '¤¡';
		
		for(int i = 0; i < apl.length; i++) {
			for(int j = 0; j < apl[i].length; j++) {
				apl[i][j] = ch;
				ch++;
			}
		}
		
		for (int i = 0; i < apl.length; i++) {
			for (int j = 0; j < apl[i].length; j++) {
				System.out.print(apl[i][j] +"\t");
			}
			System.out.println();
		}
	}
}
