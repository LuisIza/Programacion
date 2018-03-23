package leccion03;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Circulo cl = new Circulo();
		
		System.out.println("Ingrese coordenada X");
		cl.x= entrada.nextInt();
		
		System.out.println("Ingrese coordenada Y");
		cl.y= entrada.nextInt();
		
		System.out.println("Ingrese radio");
		cl.radio= entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Ingrese color");
		cl.color = entrada.nextLine();
		
		cl.mostrar();
		System.out.println("El área del circulo es: " + cl.area());
		System.out.println("El perímetro del circulo es: " + cl.perimetro());

}
}
