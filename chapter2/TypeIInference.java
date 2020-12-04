package chapter2;

public class TypeIInference {
	public static void main(String[] args) {
		var i = 10;		//int i = 10으로 컴파일됨
		var j = 10.0;		//double j = 10.0으로 컴파일됨
		var str = "hello";		// String str = "hello"로 컴파일됨

		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		System.out.println();
		
		str = "test";
		//str = 3;
		
		int I = 10;		
		double J = 10.0;		
		String Str = "hello";	
		
		System.out.println(I);
		System.out.println(J);
		System.out.println(Str);

	}
}
