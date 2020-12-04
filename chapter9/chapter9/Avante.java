package chapter9;

public class Avante extends Car {

	@Override
	protected void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
	}

	@Override
	protected void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	protected void drive() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	protected void start() {
		System.out.println("Avante 시동을 켭니다.");
	}
}
