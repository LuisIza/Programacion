package leccion09;

public class Principal {

	public static void main(String[] args) {
		
		Persona p= new Persona ("Péres López", "Laura", "4562458A");

		p.mostrar();
		
		System.out.println("-------------------------");
		Persona p2 = new Persona("Martinez Valls", "Manuel", "10200121T");

		p2.mostrar();
		
		System.out.println("-------------------------");
		Persona p3 = new Persona("Sanchez Jim", "Josep", "20312546W");
		p3.mostrar();
		
		System.out.println("-------------------------");
		Persona p4 = new Persona("Matinez", "Marcos");
		p4.mostrar();
		
		System.out.println("-------------------------");
		Persona p5 = new Persona("Dominguez");
		p5.mostrar();
		
		System.out.println("-------------------------");
		System.out.println("Los Apellidos de p son: " + p.getApellidos());
		System.out.println("Los Nombre de p es: " + p.getNombre());
		System.out.println("El DNI de p son: " + p.getDni());
		
		// Modificamos los atributos de p usando los metodos get.
		System.out.println("-------------------------");
		p.setApellidos("Jimenez Fernandez");
		p.setNombre("Lara");
		p.setDni("12457896W");
		p.mostrar();

	}

}
