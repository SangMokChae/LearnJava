package chapter9;

public abstract class Car {
	
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}

	private void washCar() {
		System.out.println("세차를 합니다.");
	}

	protected abstract void turnoff();

	protected abstract void stop();

	protected abstract void drive();

	protected abstract void start();
}
