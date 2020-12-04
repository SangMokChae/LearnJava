package test;

public class Person {
	String name;
	int money;
	String menu;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void takeByStar(StarCafe starCafe) {
		starCafe.take(4000);
		menu = "아메리카노";
		this.money = 4000;
	}
	
	public void takeByKong(KongCafe kongCafe) {
		kongCafe.take(4500);
		menu = "라떼";
		this.money = 4500;
	}
	
	public void showInfo() {
		System.out.println(name +"님은 " +menu +"를 구입하고 " +money +"를 지불했습니다.");
	}
}
