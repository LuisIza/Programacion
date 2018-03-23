package bucles;

/*
 * @author Luis
 * Ejemplo variable semáforo
 * Pedir un número si es 7 acertado si no volvr a preguntar
 */

import java.util.Scanner;

public class BucleFor12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean adivina = false;
		int numero;
		do {
			System.out.println("Adivina el numero secreto!! ");
			numero = entrada.nextInt();
			if (numero == 7) {
				adivina = true;
			}
		} while (adivina == false);
		
		System.out.println("Felicidades XD");
	}

}
