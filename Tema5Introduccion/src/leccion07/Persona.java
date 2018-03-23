package leccion07;

public class Persona {
	
	//atributos de la clase
	String apellidos;
	String nombre;
	String dni;
	
	// Constructores
	Persona(){
		System.out.println("Has creado un objeto Persona");
		
	}
	
	Persona (String apellidos, String nombre, String dni){
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		
	}
	
	Persona (String apellidos, String nombre){
		this(apellidos,nombre,"Desconocido");
//		this.apellidos = apellidos;
//		this.nombre = nombre;
//		this.dni= "Desconocido";	
	}
	
	Persona(String apellidos){
		this(apellidos,"Desconocido","Desconocido");
	}
	

	// metodo de clase
	void mostrar (){
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellidos);
		System.out.println("DNI: " + dni);
	}
		
	
}

