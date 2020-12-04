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
		System.out.println("³ĞÀÌ : " +getArea());
	}
	
	public void showInfo() {
		System.out.println("»ï°¢ÇüÀÇ ¹Øº¯ : " +width);
		System.out.println("»ï°¢ÇüÀÇ ³ôÀÌ : " +height);
	}
}
