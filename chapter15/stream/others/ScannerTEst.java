package stream.others;

import java.util.Scanner;

public class ScannerTEst {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�:");
		String name = scanner.nextLine();
		System.out.println("����:");
		String job = scanner.nextLine();
		System.out.println("���:");
		int num = scanner.nextInt();
		
		System.out.print(name+"\t");
		System.out.print(job+"\t");
		System.out.print(num+"\t");
	}
}
