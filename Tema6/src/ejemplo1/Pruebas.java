package ejemplo1;

public class Pruebas {

	public static void main(String[] args) {
	/*	
		Cliente cliente = new Cliente();
		cliente.setDni("25645895Y");
		cliente.setApellidos("Sanchez");
		cliente.setNombre("Juan");
		cliente.setVisa("7895-56897-92135-8564");
		System.out.println("Mostrando cliente...\n------------------------");
		cliente.mostrar();
		
		System.out.println("");
		Empleado emp = new Empleado ();
		
		emp.setNombre("luis");
		emp.setApellidos("Iza");
		emp.setDni("49625368C");
		emp.setNumEmpleado("565");
		System.out.println("Mostrando empleado...\n------------------------");
		emp.mostrar();
*/
		
		//Persona p1 = new Persona();
		Persona p2 = new Cliente("49621354R","Perez","Saul","4512-5623-8978-2145");
		Persona p3 = new Empleado("55914826P","Rosal","Fran","85");
		//p2.saluda();
		((Cliente)p2).saludo();
		System.out.println("Comprobamos si p2 y p3 son las mismas personas..");
		System.out.println(p2.equals(p3));
	}

}
