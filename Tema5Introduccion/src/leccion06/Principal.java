package leccion06;

public class Principal {

	public static void main(String[] args) {
		Persona p= new Persona ("Péres López", "Laura", "4562458A");
		
//		p.apellidos = "Pérez López";
//		p.nombre ="Laura";
//		p.dni = "45621458A";
		
		p.mostrar();
		
		System.out.println("-------------------------");
		Persona p2 = new Persona("Martinez Valls", "Manuel", "10200121T");
//		p2.apellidos = "Martínez Valls";
//		p2.nombre ="Manuel";
//		p2.dni = "10200121T";
//		
		p2.mostrar();
		
		System.out.println("-------------------------");
		Persona p3 = new Persona("Sanchez Jim", "Josep", "20312546W");
		p3.mostrar();

	}

}
