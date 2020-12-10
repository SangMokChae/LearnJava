package chapter10_Q1;
import java.io.IOException;

//https://m.blog.naver.com/hann726/221655068786 주소 참조

public class SortTest2 {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort ");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
//		반복문 만들어 보기
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
	}
}
