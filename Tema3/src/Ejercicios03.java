/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombres[] = new String[10];
		boolean nombreEncontrado = false;
		final String NOMBRE_BUSCADO = "Calderón";
		final String EXIT = "nadie";

		System.out.println("Introduzca 10 nombres: ");

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre " + (i + 1) + ": ");
			nombres[i] = entrada.nextLine();

			if (nombres[i].equals(EXIT)) {
				break;
			}
		}

		int i = 0;
		while (i < nombres.length && !nombres[i].equals(EXIT)) {

			if (nombres[i].equals(NOMBRE_BUSCADO)) {
				nombreEncontrado = true;
				break;
			}

			i++;

		}

		if (nombreEncontrado) {
			System.out.println("Calderón... DE LA BARCA");
		} else {
			System.out.println("Nombre no encontrado");
		}

	}

}