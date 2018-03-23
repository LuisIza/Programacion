package ejemplo2;

public abstract class Vehiculo {
	private String matricula;
	private String modelo;
	private String marca;
	
	public Vehiculo(String matricula, String modelo, String marca) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public void mostrar(){
		System.out.println("Datos del Vehiculo..................");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Matricula: " + matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
