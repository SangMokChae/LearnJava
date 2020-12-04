package example;

public class Cylinder extends Circle{

	public Cylinder(int radius, int height) {
		super(radius);
		super.height = height; //super��� this�� ����
	}
	
	public double getVolume() {
		return (getArea() * height);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�Ǹ����� ���� : " +height);
		System.out.println("�Ǹ����� ���� : " +getVolume());
	}
}
