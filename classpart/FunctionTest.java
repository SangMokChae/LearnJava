package classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int sum = add(num1, num2);
		System.out.println(num1 +" + " +num2 +" = " +sum +"�Դϴ�.");
		int sub = sub(num1, num2);
		System.out.println(num1 +" - " +num2 +" = " +sub +"�Դϴ�.");
		int mlp = mlp(num1, num2);
		System.out.println(num1 +" * " +num2 +" = " +mlp +"�Դϴ�.");
		double div = div(num1, num2);
		System.out.println(num1 +" / " +num2 +" = " +div +"�Դϴ�.");
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int mlp(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static double div(int num1, int num2) {
		double result = (double) num1 / num2;
		return result;
	}
}
