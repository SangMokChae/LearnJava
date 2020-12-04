package test;

public class TakeCafe {
	public static void main(String[] args) {
		Person Kim = new Person("Kim");
		Person Lee = new Person("Lee");
		
		StarCafe starbucks = new StarCafe("Starbucks ¿Ã∞Ó¡°");
		Kim.takeByStar(starbucks);
		Kim.showInfo();
		starbucks.showInfo();
		System.out.println();
		
		KongCafe KongCafe = new KongCafe("KongCafe ¿Ã∞Ó¡°");
		Lee.takeByKong(KongCafe);
		Lee.showInfo();
		KongCafe.showInfo();
		
		System.out.println();
		Person Son = new Person("Son");
		Son.takeByStar(starbucks);
		Son.takeByKong(KongCafe);
		starbucks.showInfo();
		KongCafe.showInfo();
	}
}

