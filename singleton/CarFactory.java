package singleton;

public class CarFactory {
	private static CarFactory instance;
	
	private CarFactory() {} //외부접근차단
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		return new Car(); //새롭게 생성된 차를 factory를 통해 생성된차에 입력
	}
}
