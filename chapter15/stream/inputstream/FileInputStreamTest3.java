package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
//				for (byte b : bs) {
				for (int k = 0; k < i; k++) {
//					System.out.print((char)b); - 출력: UVWXYZQRST / 남는 값은 위의 값에 반복이된다.
					System.out.print((char) bs[k]); // 출력: UVWXYZ / 남는 값이 없게 출력이 된다.
				}
				System.out.println(": " +i +"바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
