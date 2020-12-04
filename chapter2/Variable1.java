package chapter2;

public class Variable1{
	public static void main(String[] args) {
		// level, age
		int level = 10, age = 30;
		//name fav_foods
		String name = "bob", fav_food = "±èÄ¡, ºÒ°í±â";
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(level);
		System.out.println(fav_food);
		System.out.println("");
		// fix
		level = age + 10;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(level);
		System.out.println(fav_food);
	}
}