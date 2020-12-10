package chapter10_Q1;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void decription() {
		Sort.super.decription();
		System.out.println("BubbleSort¿‘¥œ¥Ÿ.");
	}

}
