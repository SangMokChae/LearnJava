package chapter9;

public class Grandeur extends Car {

	@Override
	protected void turnoff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	protected void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}
}
