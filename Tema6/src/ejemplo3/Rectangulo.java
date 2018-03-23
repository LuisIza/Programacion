package ejemplo3;

public class Rectangulo implements Figura2D, Mostrable{
	
	private double x,y;
	private double base, altura;
	
	public Rectangulo(double x, double y, double base, double altura) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return base*altura;
	}
	
	@Override
	public double perimetro() {
		return 2*(base+altura);
	}
	
	@Override
	public void mostrar() {
		System.out.println("X= " + x + " ; Y= "+y);
		System.out.println("Base = "+base+ "; Altura = "+ altura);
	}
	
	

}
