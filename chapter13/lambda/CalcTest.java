package lambda;

public class CalcTest {
	public static void main(String[] args) {
		Calc calc = (num1, num2) -> num1 + num2;
				/* = {return num1 + num2;} 이 앞까지 한문장으로 취급한다.;*/
		System.out.println("10 + 20 = " +calc.add(10, 20));
		
		
		//Shape 인터페이스를 사용해서 삼각형의 면적을 구하는 람다식
		Shape triangle = (width, height) -> (width * height)/2;
		System.out.println("밑변 : 10, 높이: 20 의 면적은: " +triangle.area(10, 20));
		
		//Shape 인터페이스를 사용해서 사각형의 면적을 구하는 람다식
		Shape rectangle = (width, height) -> (width * height);
		System.out.println("밑변: 10, 높이: 20 의 면적은: " +rectangle.area(10, 20));
	}
}
