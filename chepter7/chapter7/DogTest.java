package chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] puppy = new Dog[5];
		String[] dogName = {"�۹���", "�����", "�䳢", "�ٶ���", "����"};
		String[] dogType = {"���𿡵�", "�����ڱ�", "��Ʈ����", "������", "�ùٰ�"};
//		puppy[0] = new Dog("�۹���", "���𿡵�");
////		puppy[0] = new Dog();
////		puppy[0].setName("�۹���");
////		puppy[0].setType("���𿡵�");
//		puppy[1] = new Dog("�����", "�����ڱ�");
//		puppy[2] = new Dog("�䳢", "��Ʈ����");
//		puppy[3] = new Dog("�ٶ���", "������");
//		puppy[4] = new Dog("����", "�ùٰ�");
		
		for (int i = 0; i < puppy.length; i++) {
			puppy[i] = new Dog();
			puppy[i].setName(dogName[i]);
			puppy[i].setType(dogType[i]);
		}
		
		System.out.println("=========For�� ��� ���=======");
		for (int i= 0; i < puppy.length; i++) {
			System.out.println(puppy[i].showDogInfo());
		}
		
		System.out.println("=========���� For�� ��� ���=======");
		for (Dog puppy1 : puppy) {
			System.out.println(puppy1.showDogInfo());
		}
		
//		for (int i = 0; i < puppy.length; i++) {
//			puppy[i].showDogInfo();
//		}
	}
}
