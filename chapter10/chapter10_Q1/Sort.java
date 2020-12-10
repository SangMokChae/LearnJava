package chapter10_Q1;

public interface Sort {
	void ascending(int[] arr);
	void descending(int[] arr);
	default void decription() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
