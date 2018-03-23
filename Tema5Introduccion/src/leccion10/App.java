package leccion10;

public class App {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		r1.setColor("azul");
		r1.mostrar();
		System.out.println("--------------------------------------------------");
		Rectangulo r2 = new Rectangulo(8,8,10,20,"verde");
		r2.mostrar();
		System.out.println("--------------------------------------------------");
		Rectangulo r3 = new Rectangulo(8,8);
		r3.mostrar();
		System.out.println("--------------------------------------------------");
		r1.mostrar();
		System.out.println("--------------------------------------------------");
		r2.mostrar();
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("Cantidad de rectangulos creados: " + r2.getContar());
				

	}

}
