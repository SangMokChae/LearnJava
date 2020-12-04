package chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] puppy = new Dog[5];
		String[] dogName = {"멍뭉이", "고양이", "토끼", "다람쥐", "고라니"};
		String[] dogType = {"샤모에드", "웰시코기", "리트리버", "진돗개", "시바개"};
//		puppy[0] = new Dog("멍뭉이", "샤모에드");
////		puppy[0] = new Dog();
////		puppy[0].setName("멍뭉이");
////		puppy[0].setType("샤모에드");
//		puppy[1] = new Dog("고양이", "웰시코기");
//		puppy[2] = new Dog("토끼", "리트리버");
//		puppy[3] = new Dog("다람쥐", "진돗개");
//		puppy[4] = new Dog("고라니", "시바개");
		
		for (int i = 0; i < puppy.length; i++) {
			puppy[i] = new Dog();
			puppy[i].setName(dogName[i]);
			puppy[i].setType(dogType[i]);
		}
		
		System.out.println("=========For문 사용 출력=======");
		for (int i= 0; i < puppy.length; i++) {
			System.out.println(puppy[i].showDogInfo());
		}
		
		System.out.println("=========향상된 For문 사용 출력=======");
		for (Dog puppy1 : puppy) {
			System.out.println(puppy1.showDogInfo());
		}
		
//		for (int i = 0; i < puppy.length; i++) {
//			puppy[i].showDogInfo();
//		}
	}
}
