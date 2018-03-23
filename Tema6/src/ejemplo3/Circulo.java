package ejemplo3;

public class Circulo implements Figura2D, Mostrable {

	private int x, y;
	private int radio;
	
	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	@Override
	public void mostrar() {
		System.out.printf("%-13s %3d %3d\n", "Coordenadas:", x, y);
		System.out.printf("%-13s %3d\n","Radio:",radio);
	}

}