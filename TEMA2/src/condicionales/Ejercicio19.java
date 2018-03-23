
/*
 * Autor Luis Iza
 */
package condicionales;
import java.util.*;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int NUM = 3;
		int numero;
		
			System.out.println("Ingrese un número");
			
			//comprovamos que el dato introducido es un entero
			while (entrada.hasNextInt() == false) {
				System.out.println("Entrada incorrecta");
				System.out.println("Vuelve a introducir ");
				entrada.next();
			}
			
			numero = entrada.nextInt();
			if (numero == NUM){
			System.out.println("Has acertado " + numero);
			}
				
			
			
		
	}

}