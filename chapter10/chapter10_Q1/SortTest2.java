package chapter10_Q1;
import java.io.IOException;


public class SortTest2 {
	public static void main(String[] args) throws IOException {
		while(true) {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort ");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch =='B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.decription();
		ch = System.in.read(); //enter는 2개 키에 해당한다.
		ch = System.in.read(); //다음에는 bufferedReader를 사용해보자
		System.out.println();
		}
	}
}
