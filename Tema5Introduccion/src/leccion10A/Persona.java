package leccion10A;

public class Persona {
	
	//atributos de la clase
	private String apellidos;
	private String nombre;
	private String dni;
	private static int numPersonas;
	
	
	
	
	
	// Constructores
	public Persona(){
		System.out.println("Has creado un objeto Persona");
		
	}
	
	public Persona (String apellidos, String nombre, String dni){
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		numPersonas++;
	}
	
	public Persona (String apellidos, String nombre){
		this(apellidos,nombre,"Desconocido");
//		this.apellidos = apellidos;
//		this.nombre = nombre;
//		this.dni= "Desconocido";
		
	}
	
	public Persona(String apellidos){
		this(apellidos,"Desconocido","Desconocido");
		
	}
	

	// metodo de clase
	public void mostrar (){
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellidos);
		System.out.println("DNI: " + dni);
	}
	
	
	//METODOS DE ACCESO
	
	public String getApellidos (){
		return apellidos;
	}
	
	public String getNombre (){
		return nombre;
	}
	
	public String getDni (){
		return dni;
	}	
	
	public static int getContar(){
		return numPersonas;
	}
	public static void setContar(int numPersonas){
		numPersonas=numPersonas;
	}
	
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setDni(String dni){
		this.dni = dni;
	}
	
	
	
}

