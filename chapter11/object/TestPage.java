package object;

import java.io.IOException;

public class TestPage {
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("what number?");
			int li = System.in.read();
			if(li == 1) {
				System.out.print("no");
			} else {
				System.out.println("yes");
			}
			return;
		}
	}
}
