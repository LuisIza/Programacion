package ejemplo1;

public class Cliente extends Persona {
	
	private String visa;
	public Cliente(){
		
	}

	public Cliente(String dni, String nombre, String apellidos, String visa) {
		super(dni, nombre, apellidos);
		this.visa = visa;
	}
	
	public void darDealta(){
		
	}
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Num Visa: " + visa);
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
	
	public void saludo(){
		System.out.println("Hola mundo..."+ nombre);
	}
	
	
}
