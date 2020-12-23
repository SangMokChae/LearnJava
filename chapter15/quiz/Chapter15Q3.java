package quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Chapter15Q3 {
	public static void main(String[] args) {
		FileOutputStream fs = new FileOutputStream("a.text") {
			fs.write("지금까지 자바 정말 재미있게 공부했어요^^");
		}
	}

}
