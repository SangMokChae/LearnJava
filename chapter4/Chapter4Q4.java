package chapter4;

public class Chapter4Q4 {
	public static void main(String[] args) {
		int size = 10;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j < i + size; j++) {
				if (size - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
