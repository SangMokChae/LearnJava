package chapter9;

public class Avante extends Car {

	@Override
	protected void turnoff() {
		System.out.println("Avante �õ��� ���ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Avante ����ϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Avante �޸��ϴ�.");
	}

	@Override
	protected void start() {
		System.out.println("Avante �õ��� �մϴ�.");
	}
}
