package leccion02;

public class Main {
	public static void main(String[] args) {
		Punto a = new Punto();
		a.x= 8;
		a.y= 15;
		a.color="azul";
		//mostramos atrubutos del punto
		a.mostrar();
		//desplazamos 20 pixels a la derecha
		a.desplazar(20);
		a.mostrar();
		
		
		
		Punto b = new Punto();
		b.x= 18;
		b.y= 5;
		b.color="rojo";
		
		b.mostrar();
		
		//desplazamos 50 pixels a la derecha
		b.desplazar(50);
		b.mostrar();
	}

}
