package chapter9;

public class Genesis extends Car {

	@Override
	protected void turnoff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Genesis ����ϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Genesis �޸��ϴ�.");
	}

	@Override
	protected void start() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}
}
