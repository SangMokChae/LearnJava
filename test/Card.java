package test;

public class Card {
//	public static long cardNum = 1000000000000000l;
//	public static String cardFrom = "KoreaCard ";
//	public String user;
//	
////	public String getCardFrom(String cardFrom) {
////		return cardFrom;
////	}
////	
////	public long getCardNum() {
////		return cardNum++;
////	}
////	
////	public String getUser() {
////		return user;
////	}
////	
////	public void setUser(String name) {
////		user = name;
////	}
	
	static long serailNum = 1000000000000000l;
	String cardName;
	String cardNum;
	
	public Card() {
		serailNum++;
		cardNum=String.valueOf(serailNum);
	}
	
	public Card(String cardName) {
		this();
		this.cardName = cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public String getCardNum() {
		return cardNum.substring(0,4) +"-" +cardNum.substring(4,8) +"-" +cardNum.substring(8,12) +"-" +cardNum.substring(12,16);
	}
}
