package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // ���̸� ���ϴ� ��! [1,2,3]
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		
		return(arrayStack.remove(len-1)); // [3,2,1] [2,1] [1] (������ ������ϴ�., null)...
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}