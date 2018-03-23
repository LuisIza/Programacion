package condicionales;
import java.util.Scanner;

public class Condicionales12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese precio");
		float precio = entrada.nextFloat();

		// compra mayor 100 descuento
		if (precio >= 500) {
			double dto = precio * 0.20;
			System.out.println("\nTiene un descuento de 20%: " + dto);
			System.out.println(("Total a pagar " + (precio - dto)));
			// compra mayor 500 dto de 20% si no dto 10%
		} else if (precio > 100) {
			double dto = precio * 0.10;
			System.out.println("\nTiene un descuento de 10%: " + dto);
			System.out.println(("Total a pagar: " + (precio - dto)));
		} else {
			System.out.println("No tiene descuento");
		}

	}
}
