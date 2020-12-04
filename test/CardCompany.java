package test;

public class CardCompany {
	private static CardCompany instance; //내부 return
	String companyName;
	
	private CardCompany() {} //외부 차단
	
	private CardCompany(String companyName) { //카드회사이름 호출
		this.companyName = companyName;
	}
	
	public static CardCompany getInstance(String companyName) { // return 값이 instance가 되기위한 static
		if (instance == null) {
			instance = new CardCompany(companyName);
		}
		return  instance;
	}
	
	public Card createCard() { //return 값은 카드이다.
		return new Card(); //새로운 카드를 리턴해준다.
	}
	
	public Card createCard(String cardName) {
		return new Card(cardName);
	}
}
