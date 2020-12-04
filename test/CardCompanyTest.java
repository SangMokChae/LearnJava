package test;

public class CardCompanyTest {
	public static void main(String[] args) {
		CardCompany company= CardCompany.getInstance("삼성카드");
		
		Card myBC = company.createCard("BC");
		Card myVisa = company.createCard("Visa");
		
		System.out.println("카드회사 : " +company.companyName);
		System.out.println(myBC.getCardName() +" : " +myBC.getCardNum());
		System.out.println(myVisa.getCardName() +" : " +myVisa.getCardNum());
		
		Card myBC1 = company.createCard("BC");
		System.out.println(myBC1.getCardName() +" : " +myBC1.getCardNum());
		Card myBC2 = company.createCard("BC");
		System.out.println(myBC2.getCardName() +" : " +myBC2.getCardNum());
		Card myBC3 = company.createCard("BC");
		System.out.println(myBC3.getCardName() +" : " +myBC3.getCardNum());
		Card myBC4 = company.createCard("BC");
		System.out.println(myBC4.getCardName() +" : " +myBC4.getCardNum());
		Card myBC5 = company.createCard("BC");
		System.out.println(myBC5.getCardName() +" : " +myBC5.getCardNum());
		Card myBC11 = company.createCard("BC");
		System.out.println(myBC11.getCardName() +" : " +myBC11.getCardNum());
		Card myBC6 = company.createCard("BC");
		System.out.println(myBC6.getCardName() +" : " +myBC6.getCardNum());
		Card myBC7 = company.createCard("BC");
		System.out.println(myBC7.getCardName() +" : " +myBC7.getCardNum());
		Card myBC8 = company.createCard("BC");
		System.out.println(myBC8.getCardName() +" : " +myBC8.getCardNum());
		Card myBC9 = company.createCard("BC");
		System.out.println(myBC9.getCardName() +" : " +myBC9.getCardNum());
		Card myBC10 = company.createCard("BC");
		System.out.println(myBC10.getCardName() +" : " +myBC10.getCardNum());
	}
}
