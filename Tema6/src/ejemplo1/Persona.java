package ejemplo1;

public  abstract class Persona {

	protected String dni;
	protected String nombre;
	protected String apellidos;

	public Persona(){
		
	}
	
	public Persona(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public void mostrar(){
		System.out.println("Dni: " + dni);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Nombre: " + nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}else if (obj== null) {
			return false;
		}else if (obj instanceof Persona) {
			return dni.equals(((Persona)obj).dni);
		}else {
			return false;
		}
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	// metodo para pedir todos los datos necesarios
	public abstract void darDealta();
	
	
}
