package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	public void enQueu(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size(); // ���̸� ���ϴ� ��!
		if(len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		
		return (arrayQueue.remove(0)); //[0,1,2] [0,1] [0] (ť�� ������ϴ�. null)
	}
}
public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueu("A");
		queue.enQueu("B");
		queue.enQueu("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
