package stream.inputstream;

import java.io.IOException;

public class SystemIntest1 {
	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		char i;
//		try {
//			i = (char) System.in.read();
//			System.out.println(i);
//			System.out.println((int)i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
