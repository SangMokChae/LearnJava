package test;

public class CardTest {
	public static void main(String[] args) {
//		Card samsung1 = new Card();
//		samsung1.setUser("이지원");
//		System.out.print(samsung1.cardFrom);
//		System.out.println(samsung1.cardNum);
//		++samsung1.cardNum;
//		
//		Card samsung2 = new Card();
//		samsung2.setUser("박지원");
//		System.out.print(samsung2.cardFrom);
//		System.out.println(samsung2.cardNum);
//		samsung2.cardNum++;
//		
//		Card samsung3 = new Card();
//		samsung3.setUser("손수경");
//		System.out.print(samsung3.cardFrom);
//		System.out.println(samsung3.cardNum);
//		samsung3.cardNum++;
		
		Card card1 = new Card("삼성카드");
		Card card2 = new Card("신한카드");
		Card card3 = new Card("BC카드");
		
		System.out.println(card1.getCardName() +" 카드번호 : " +card1.getCardNum());
		System.out.println(card2.getCardName() +" 카드번호 : " +card2.getCardNum());
		System.out.println(card3.getCardName() +" 카드번호 : " +card3.getCardNum());
	}
}
