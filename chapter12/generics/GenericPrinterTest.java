package generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
//		powderPrinter.toString(); //toString은 Object에 존재
//		powderPrinter.doPrinter(); // doPrinteter는 GenericPrinter에 존재하지 않는다.
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
//			GenericPrinter powderPrint2 = new GenericPrinter();
//	//			GenericPrinter<Object> powderPrint3 = new GenericPrinter();
//			powderPrint2.setMaterial(new Powder());
//			Powder powder2 = (Powder)powderPrinter.getMaterial();
//			System.out.println(powderPrinter);
	}
}
