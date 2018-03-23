package condicionales;
import java.util.*;
public class Condicionales16 {
	//preguntar el numero del mes y decir los dias del mes
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese el numero del Mes");
		int mes= entrada.nextInt();
		switch (mes){
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
