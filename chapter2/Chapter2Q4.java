package chapter2;

public class Chapter2Q4 {
	public static void main(String[] args) {
		
		int iNum = 10;
		double dNum = 2.0;
		
//		int a = ((int)iNum + (int)dNum);
//		int b = ((int)iNum - (int)dNum);
//		int c = ((int)iNum * (int)dNum);
//		int d = ((int)iNum / (int)dNum);
		
		int a = (int)(iNum + dNum);
		int b = (int)(iNum - dNum);
		int c = (int)(iNum * dNum);
		int d = (int)(iNum / dNum);
		
//		System.out.println("10 + 2.0 = 12");
		System.out.println(iNum +" + " +dNum +" = " +(int)(iNum + dNum));
//		System.out.println("10 - 2.0 = 12");
		System.out.println(iNum +" - " +dNum +" = " +(int)(iNum - dNum));
//		System.out.println("10 * 2.0 = 12");
		System.out.println(iNum +" * " +dNum +" = " +(int)(iNum * dNum));
//		System.out.println("10 / 2.0 = 12");
		System.out.println(iNum +" / " +dNum +" = " +(int)(iNum / dNum));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
