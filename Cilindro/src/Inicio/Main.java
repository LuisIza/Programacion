package Inicio;
import java.util.Scanner;
import java.util.Timer;

import Geometria.Cilindro;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cilindro c1 = new Cilindro ();
		
		System.out.println("Ingrese la altura del Cilindro 1");
		int altura = scan.nextInt();
		c1.setAltura(altura);
		
		System.out.println("Ingrese el radio del Cilindro 1");
		int radio = scan.nextInt();
		c1.setRadio(radio);
		
		System.out.println("Area del Cilindro 1 es: " + c1.getArea() + " metros 2");
		System.out.println("Volumen del Cilindro 1 es: " + c1.getVolumen() + " metros 3");
		
		Cilindro c2 = new Cilindro (6,6);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Datos del Cilindro 2 ");
		System.out.println(c2.toString());
		System.out.println("Area del Cilindro 2 es: " + c1.getArea() + " metros 2");
		System.out.println("Volumen del Cilindro1 2 es: " + c1.getVolumen() + " metros 3");
	}

}
