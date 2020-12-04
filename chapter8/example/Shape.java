package example;

public class Shape {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	public static final double pi = 3.14159; // p/s/f 순서 바꿔도 상관 없음
	
	public Shape() {}
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Shape(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void showInfo() { //반환값이 없기때문에 void 사용 
		System.out.println("도형의 X좌표 : " +x);
		System.out.println("도형의 Y좌표 : " +y); 
		System.out.println("도형의 넓이 : " +width); 
		System.out.println("도형의 높이 : " +height); 
	}
	
	public double getArea() {
		return 0;
	}
}
