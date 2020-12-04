package example;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> shape = new ArrayList<> ();
		
//		Shape triangle = new Triangle(10, 30);
//		Shape rectangle = new Rectangle(50, 25);
//		Shape cricle = new Circle(5);
//		Shape cylinder = new Cylinder(10, 20);
//		
//		shape.add(triangle);
//		shape.add(rectangle);
//		shape.add(cricle);
//		shape.add(cylinder);
		
		shape.add(new Triangle(10, 30));
		shape.add(new Rectangle(50, 25));
		shape.add(new Circle(5));
		shape.add(new Cylinder(10, 20));
		
		for (Shape sp : shape) {
			sp.showInfo();
			System.out.println("≥–¿Ã : " +sp.getArea());
			if(sp instanceof Circle) {
				Circle c = (Circle)sp;
				System.out.println("ø¯¡÷ : " +c.getCircumFerence());
			}
			System.out.println();
		}
	}
}
