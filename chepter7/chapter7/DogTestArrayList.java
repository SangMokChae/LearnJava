package chapter7;
import java.util.ArrayList;

public class DogTestArrayList {
		ArrayList<Dog> list = new ArrayList<> ();
		
		public static void main(String[] args) {
		DogTestArrayList dtal = new DogTestArrayList();
		
		String[] dogName = {"�۹���", "�����", "�䳢", "�ٶ���", "����"};
		String[] dogType = {"���𿡵�", "�����ڱ�", "��Ʈ����", "������", "�ùٰ�"};
		
		
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
			list.add(dog); //��ü �ʿ� ����
		}
}
