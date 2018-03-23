package leccion01;

public class Principal {

	public static void main(String[] args) {
		Persona p= new Persona ();
		
		p.apellidos = "Pérez López";
		p.nombre ="Laura";
		p.dni = "45621458A";
		
		p.mostrar();
		
		Persona p2 = new Persona();
		p2.apellidos = "Martínez Valls";
		p2.nombre ="Manuel";
		p2.dni = "10200121T";
		
		p2.mostrar();
		

	}

}
