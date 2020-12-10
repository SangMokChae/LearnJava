package chapter10_Q1;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void decription() {
		Sort.super.decription();
		System.out.println("HeapSort¿‘¥œ¥Ÿ.");
	}

}
