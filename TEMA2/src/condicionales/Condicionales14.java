package condicionales;
import java.util.*;

public class Condicionales14 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);

		System.out.println("Ingrese el Numero de un mes\n");
		int mes = Entrada.nextInt();

		if (mes == 12) {
			System.out.println("El mes correspondiente al numero es Diciembre");

		} else {
			if (mes == 11) {
				System.out
						.println("El mes correspondiente al numero es Noviembre");
			} else {
				if (mes == 10) {
					System.out
							.println("El mes correspondiente al numero es Octubre");
				} else {
					if (mes == 9) {
						System.out
								.println("El mes correspondiente al numero es Septiembre");
					}
				}

			}
		}
	}

}
