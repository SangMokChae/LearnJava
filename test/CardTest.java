package test;

public class CardTest {
	public static void main(String[] args) {
//		Card samsung1 = new Card();
//		samsung1.setUser("������");
//		System.out.print(samsung1.cardFrom);
//		System.out.println(samsung1.cardNum);
//		++samsung1.cardNum;
//		
//		Card samsung2 = new Card();
//		samsung2.setUser("������");
//		System.out.print(samsung2.cardFrom);
//		System.out.println(samsung2.cardNum);
//		samsung2.cardNum++;
//		
//		Card samsung3 = new Card();
//		samsung3.setUser("�ռ���");
//		System.out.print(samsung3.cardFrom);
//		System.out.println(samsung3.cardNum);
//		samsung3.cardNum++;
		
		Card card1 = new Card("�Ｚī��");
		Card card2 = new Card("����ī��");
		Card card3 = new Card("BCī��");
		
		System.out.println(card1.getCardName() +" ī���ȣ : " +card1.getCardNum());
		System.out.println(card2.getCardName() +" ī���ȣ : " +card2.getCardNum());
		System.out.println(card3.getCardName() +" ī���ȣ : " +card3.getCardNum());
	}
}
