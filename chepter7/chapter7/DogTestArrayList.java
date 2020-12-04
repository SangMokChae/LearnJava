package chapter7;
import java.util.ArrayList;

public class DogTestArrayList {
		ArrayList<Dog> list = new ArrayList<> ();
		
		public static void main(String[] args) {
		DogTestArrayList dtal = new DogTestArrayList();
		
		String[] dogName = {"멍뭉이", "고양이", "토끼", "다람쥐", "고라니"};
		String[] dogType = {"샤모에드", "웰시코기", "리트리버", "진돗개", "시바개"};
		
		
		for (int i = 0; i < dogName.length; i++) {
			Dog dog = new Dog();
			dog.setName(dogName[i]);
			dog.setType(dogType[i]);
			dtal.list.add(dog);
//			dtal.addDog(dogName[i], dogType[i]);
		}
		
		for (Dog dog : dtal.list) {
			System.out.println(dog.showDogInfo());
		}
	}
		
		public void addDog(String dogName, String dogType) {
			Dog dog = new Dog();
			dog.setName(dogName);
			dog.setType(dogType);
			list.add(dog); //객체 필요 없음
		}
}
