package chapter3;

public class OperationEx4_1 {
	public static void main(String[] args) {
		
		int num = 10;
		boolean isEven;
		isEven = ((num % 2) == 0) ? true : false;
		System.out.println(isEven);
		
		num = 53;
		String isPass;
		isPass = ((num % 2) != 1) ? "¦��" : "Ȧ��";
		System.out.println(isPass);
	}
}
