package bucles;

/*
 * @author Luis
 */
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i = 1;
		int j = 1;
		System.out.println("Tabla de Multiplicar");
		int num;

		do {
			System.out.println("Ingrese un número");
			num = entrada.nextInt();

			if (num == 1) {
				System.out.println("No seas tonto");
				continue;
			} else {
				i++;

				System.out.println("La tabla del " + num);
				while (j <= 10) {

					System.out.println(num + " x " + j + " = " + (num * j));
					j++;
				}
			}
			j = 1;

		} while (i <= 5);

		System.out.println("Fin");
	}

}
