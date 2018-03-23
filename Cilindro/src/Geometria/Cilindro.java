package Geometria;

public class Cilindro {

		private int altura;
		private int radio;
		private final double PI = 3.1516;

		//	CONSTRUCTORES
	public Cilindro(){	}
		
	public Cilindro(int altura, int radio){
		this.altura = altura;
		this.radio = radio;
	}
		
		// METODOS
	public double getArea(){	
		return 2*PI*radio*(radio+altura);
	}
	public double getVolumen(){	
		return PI*(radio*radio) * altura;
	}
	
	public String toString(){
		String mensaje = "Altura del Cilindro: " + altura +" --  Radio del Cilindro: " + radio;
		return mensaje;
	}
		
		//	METODOS DE ACCESO
	public int getAltura(){
		return altura;
	}
	public int getRadio(){
		return radio;
	}
	public void setAltura (int altura){
		this.altura = altura;
	}
	public void setRadio (int radio){
		this.radio = radio;
	}
		
}
