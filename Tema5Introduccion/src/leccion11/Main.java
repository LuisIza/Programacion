package leccion11;

public class Main {

	public static void main(String[] args) {
		Coche c1 = new Coche ("Seat", "Leon", "Rojo","2255 GTR", 12000);
		Coche c2 = new Coche ("Darcia", "Sandero", "Blanco","8965 RTE", 15000);
		
		c1.setDescuento(15);

		System.out.println("Descuento de C1 = "+ c1.getDescuento());
		System.out.println("Descuento de C2 = "+ c2.getDescuento());
	}

}
