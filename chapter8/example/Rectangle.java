package example;

public class Rectangle extends Shape{

	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public double getArea() {
		return (width*height);
	}
	
	@Override
	public void showInfo() {
		System.out.println("사각형의 밑변 : " +width);
		System.out.println("사각형의 높이 : " +height);
	}
}
