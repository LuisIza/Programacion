package leccion04;
import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Rectangulo r1 = new Rectangulo();
		
		r1.x = 3;
		r1.y = 5;
		r1.altura = 20;
		r1.base = 10;
		r1.color = "azul";
		r1.mostrar();
		
		System.out.println("El area del rectangulo es: " + r1.area() + " cm2.");
		
		System.out.println("El perimetro del rectangulo es: " + r1.perimetro() + " cm.");
		
		r1.mover(2, 5);
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Movemos el punto de inicio del rectangulo (2,5)");
		System.out.println("A cambiado el punto de inicio del rectangulo a (" + r1.x +  ", "+r1.y + ").");
		
				

	}

}
