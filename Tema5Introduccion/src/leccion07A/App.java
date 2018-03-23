package leccion07A;
import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Rectangulo r1 = new Rectangulo();
		r1.mostrar();
		System.out.println("--------------------------------------------------");
		Rectangulo r2 = new Rectangulo(8,8,10,20,"verde");
		r2.mostrar();
		System.out.println("--------------------------------------------------");
		Rectangulo r3 = new Rectangulo(8,8);
		r3.mostrar();
		
				

	}

}
