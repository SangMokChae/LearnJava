package lambda;

public class CalcTest {
	public static void main(String[] args) {
		Calc calc = (num1, num2) -> num1 + num2;
				/* = {return num1 + num2;} �� �ձ��� �ѹ������� ����Ѵ�.;*/
		System.out.println("10 + 20 = " +calc.add(10, 20));
		
		
		//Shape �������̽��� ����ؼ� �ﰢ���� ������ ���ϴ� ���ٽ�
		Shape triangle = (width, height) -> (width * height)/2;
		System.out.println("�غ� : 10, ����: 20 �� ������: " +triangle.area(10, 20));
		
		//Shape �������̽��� ����ؼ� �簢���� ������ ���ϴ� ���ٽ�
		Shape rectangle = (width, height) -> (width * height);
		System.out.println("�غ�: 10, ����: 20 �� ������: " +rectangle.area(10, 20));
	}
}
