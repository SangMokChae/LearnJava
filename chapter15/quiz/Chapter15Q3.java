package quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Chapter15Q3 {
	public static void main(String[] args) {
		FileOutputStream fs = new FileOutputStream("a.text") {
			fs.write("���ݱ��� �ڹ� ���� ����ְ� �����߾��^^");
		}
	}

}
