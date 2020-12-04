package example;

public class Circle extends Shape{
	protected int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return ((radius * radius) * pi);
	}
	
	public double getCircumFerence() {
		return (2 * radius * pi);
	}

	@Override
	public void showInfo() {
		System.out.println("원의 반지름 : " +radius);
	}	
}
