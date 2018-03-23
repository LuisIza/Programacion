package ejemplo3;

public class Main {

public static void main(String[] args) {
		
		Circulo circ = new Circulo(10, 15, 100);		
		Rectangulo rec = new Rectangulo (5,5,100,50);
		
		System.out.println(areaCirculo(circ));
		
		Figura2D fig1 = new Circulo (10,10,5);
		Figura2D fig2 = new Rectangulo (5,5,10,20);
		
}


	public static  double areaCirculo( Figura2D figura) {
	 return figura.area();
	}

}
