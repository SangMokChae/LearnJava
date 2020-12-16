package chapter12Q;

import java.util.HashMap;

public class CarFactory{
	private static CarFactory carFactory;
	private HashMap<String, Car> hashMap = new HashMap<>();
	
	public static CarFactory getInstance() {
		if(carFactory == null)
			carFactory = new CarFactory();
		return carFactory;
	}

	public Car createCar(String key) {
		Car car = null;
		if(!hashMap.containsKey(key)) {
			hashMap.put(key, new Car(key));
		} else {
			car=hashMap.get(key);
		}
		return car;
	}
}

//이거를 혼자 구연해보도록 연습하기!