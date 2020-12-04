package constructor;

public class Rect {
	int height;
	int width;
	int Area;
	
	public int getArea() {
		return height*width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}	
}

class Triangle {
	int height;
	int width;
	int Area;
	
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return Area;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getArea() {
		return (height*width)/2.0;
	}
}