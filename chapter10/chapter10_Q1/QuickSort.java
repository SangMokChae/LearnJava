package chapter10_Q1;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}


	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void decription() {
		Sort.super.decription();
		System.out.println("QickSort¿‘¥œ¥Ÿ.");
	}
}
