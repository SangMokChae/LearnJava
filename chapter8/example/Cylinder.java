package example;

public class Cylinder extends Circle{

	public Cylinder(int radius, int height) {
		super(radius);
		super.height = height; //super대신 this도 가능
	}
	
	public double getVolume() {
		return (getArea() * height);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("실린더의 높이 : " +height);
		System.out.println("실린더의 부피 : " +getVolume());
	}
}
