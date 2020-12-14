package generics;

public class GenericPrinter2<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		material.doPrinting();
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
}
