package condicionales;
// programa q pregunte numero de mes y devuelva el nombre del mes
//ademas valida la entrada sea numero entero
import java.util.*;

public class Condicionales18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nuemero del mes (1-12)\n");

		if (entrada.hasNextInt() == false) {
			System.out.println("El numero fuera de rango (1-12)");
			System.exit(0);
			
		} 
			int mes = entrada.nextInt();
			switch (mes) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}
	}


