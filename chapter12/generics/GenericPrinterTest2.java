package generics;

public class GenericPrinterTest2 {
	public static void main(String[] args) {
		GenericPrinter2<Powder2> powderPrinter = new GenericPrinter2<Powder2>();
		
		powderPrinter.setMaterial(new Powder2());
		powderPrinter.printing();
//			Powder2 powder = powderPrinter.getMaterial();
//			powderPrinter.toString(); //toString은 Object에 존재
//			powderPrinter.doPrinter(); // doPrinteter는 GenericPrinter에 존재하지 않는다.
//			System.out.println(powderPrinter);
		
		GenericPrinter2<Plastic2> plasticPrinter = new GenericPrinter2<Plastic2>();
		
		plasticPrinter.setMaterial(new Plastic2());
		plasticPrinter.printing();
		
//			Plastic2 plastic = plasticPrinter.getMaterial();
//			System.out.println(plasticPrinter);
		
//			GenericPrinter powderPrint2 = new GenericPrinter();
//	//			GenericPrinter<Object> powderPrint3 = new GenericPrinter();
//			powderPrint2.setMaterial(new Powder());
//			Powder powder2 = (Powder)powderPrinter.getMaterial();
//			System.out.println(powderPrinter);
	}
}
