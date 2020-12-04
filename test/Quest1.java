package test;

public class Quest1 {
	public static void main(String[] args) {
		int x = 300;
		int y = 300;
		
		//x 결과값
		int result1 = x / 42;
		int result2 = x % 42;
		
		//y 결과값
		int result3 = y / 38;
		int result4 = y % 38;
		
		System.out.println(x +"을 42로 나눈 몫은 " +result1 +"이고 나머지는 " +result2 +"입니다.");
		System.out.println(y +"을 38로 나눈 몫은 " +result3 +"이고 나머지는 " +result4 +"입니다.");
		
//		int x, y;
//		x=y=300;
//				
//		System.out.println(x +"을 42로 나눈 몫은 " +(x/42) +"이고 나머지는 " +(x%42) +"입니다.");
//		System.out.println(y +"을 38로 나눈 몫은 " +(y/38) +"이고 나머지는 " +(y%38) +"입니다.");
	}
}
