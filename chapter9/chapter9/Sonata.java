package chapter9;

public class Sonata extends Car {

	@Override
	protected void turnoff() {
		System.out.println("Sonata �õ��� ���ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Sonata ����ϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	protected void start() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}
}
