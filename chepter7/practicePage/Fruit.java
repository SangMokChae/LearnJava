package practicePage;

public class Fruit {
	public String name;
	public String color;
	public double weight;
	public int count;
	
	public Fruit(String name, String color) {
		this(name, color, 0.0, 0);
	}
	
	public Fruit(String name, String color, double weight, int count) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.count = count;
	}
	
	public static void main(String[] args) {
		Fruit banana = new Fruit("banana", "yellow", 5.0, 10);
		System.out.println("name : " +banana.name);
		System.out.println("color : " +banana.color);
		System.out.println("weight : " +banana.weight);
		System.out.println("count : " +banana.count);	
	}
}