package chapter10_Q1;

public interface Sort {
	void ascending(int[] arr);
	void descending(int[] arr);
	default void decription() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
