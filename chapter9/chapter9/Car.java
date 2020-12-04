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
		System.out.println("������ �մϴ�.");
	}

	protected abstract void turnoff();

	protected abstract void stop();

	protected abstract void drive();

	protected abstract void start();
}
