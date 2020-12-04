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
		System.out.println("�簢���� �غ� : " +width);
		System.out.println("�簢���� ���� : " +height);
	}
}
