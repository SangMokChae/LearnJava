package test;

public class CardCompany {
	private static CardCompany instance; //���� return
	String companyName;
	
	private CardCompany() {} //�ܺ� ����
	
	private CardCompany(String companyName) { //ī��ȸ���̸� ȣ��
		this.companyName = companyName;
	}
	
	public static CardCompany getInstance(String companyName) { // return ���� instance�� �Ǳ����� static
		if (instance == null) {
			instance = new CardCompany(companyName);
		}
		return  instance;
	}
	
	public Card createCard() { //return ���� ī���̴�.
		return new Card(); //���ο� ī�带 �������ش�.
	}
	
	public Card createCard(String cardName) {
		return new Card(cardName);
	}
}
