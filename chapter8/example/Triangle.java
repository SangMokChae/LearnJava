package example;

public class Triangle extends Shape{
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return ((width * height) / 2);
	}
	
	public void showArea() {
		System.out.println("���� : " +getArea());
	}
	
	public void showInfo() {
		System.out.println("�ﰢ���� �غ� : " +width);
		System.out.println("�ﰢ���� ���� : " +height);
	}
}
