package condicionales;
import java.util.Scanner;

public class Condicionales17 {
	// preguntar el numero del mes y decir los dias del mes

	// validar la entrada de datos en numero entero
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el numero del Mes");
		
		if (entrada.hasNextInt() == false) {
			System.out
					.println("Entrada incorrecta numero tiene q ser entre 1-12");

		} else {

			int mes = entrada.nextInt();
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("El mes " + mes + " tiene 31 dias");
				break;
			case 2:
				System.out.println("El mes " + mes + " tiene 28 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El mes " + mes + " tiene 30 dias");
				break;
			default:
				System.out.println("Opcion no valida (1-12)");
			}
		}

	}

}
