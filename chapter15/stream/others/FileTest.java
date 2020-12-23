package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\JAVA\\First\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
		
		System.out.println();
		File file1 = new File("C:\\JAVA\\First");
		System.out.println(file1.isDirectory());
		
		System.out.println();
		File file2 = new File("data.txt");
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());
	}
}
