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
		menu = "�Ƹ޸�ī��";
		this.money = 4000;
	}
	
	public void takeByKong(KongCafe kongCafe) {
		kongCafe.take(4500);
		menu = "��";
		this.money = 4500;
	}
	
	public void showInfo() {
		System.out.println(name +"���� " +menu +"�� �����ϰ� " +money +"�� �����߽��ϴ�.");
	}
}
