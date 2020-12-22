package stream.others;

import java.util.Scanner;

public class ScannerTEst {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scanner.nextLine();
		System.out.println("직업:");
		String job = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
		
		System.out.print(name+"\t");
		System.out.print(job+"\t");
		System.out.print(num+"\t");
	}
}
