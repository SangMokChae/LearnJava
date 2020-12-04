package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
//	public Person(String pname, float pheight, float pweight) {
//		name= pname;
//		height = pheight;
//		weight = pweight;
//	}
	
	public Person(String pname) {
		name = pname;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}
}
