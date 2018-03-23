package bucles;
import java.util.Scanner;
/*
 * Ejemplo pedir un dato continuamente hasta q sea correcto
 */
public class Bucleswhile7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un Número");
		//Leer entero
		
		//while (!entrada.hasNextInt() ) {
		while (entrada.hasNextInt() == false) {
			System.out.println("Entrada incorrecta");
			entrada.nextLine();
		}
	}

}
