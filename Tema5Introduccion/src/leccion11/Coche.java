package leccion11;

public class Coche {
	//	ATRUBUOS
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private double precio;
	private static double descuento;
	
	
	//	CONSTRUCTORES
	public Coche (String marca, String modelo, String color,
			String matricula, double precio){
		this.marca = marca;
		this.modelo = modelo;
		this.color=color;
		this.matricula=matricula;
		this.precio=precio;
		
	}
	
	
	
	
	//	METODOS	
	
	public void arrancar (){
		System.out.println("Arrancando....");
	}
	public void detenerse (){
		System.out.println("Frenando....");
	}
	public void acelerar (){
		System.out.println("Acelerando....");
	}
	public void frenar (){
		System.out.println("Frenando....");
	}
	public double verPrecio (){
		return precio-precio*descuento /100;
	}
	
	//	METODOS	ACCESO
	public void setDescuento(double descuento){
		this.descuento=descuento;
	}
	
	public double getDescuento(){
		return descuento;
	}
	
	
	
}
