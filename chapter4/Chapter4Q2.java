package chapter4;

public class Chapter4Q2 {
	public static void main(String[] args) {
//		int dan = 1;
//		
//		for(dan = 2;dan <= 9; dan++) {
//			if (dan % 2 == 0)
//				for(int times = 1; times <= 9; times++) {
//					System.out.print(dan +"X" +times +"=" +(dan*times+"\t"));
//				continue;
//			}
//			System.out.println();
//		}
//	}
//}


	for(int dan = 2; dan <= 9; dan++) {
		for (int times = 1; times <= 9; times++) {
			if (dan % 2 == 0)
				System.out.println(dan +"X" +times +"=" +(dan*times));
			continue;
		}
		System.out.println();
		}
	}
}
