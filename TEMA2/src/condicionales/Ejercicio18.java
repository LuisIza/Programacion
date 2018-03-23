
/*
 * Autor Luis Iza
 */
package condicionales;
import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
			System.out.println("Ingrese un número");
			
			//comprovamos que el dato introducido es un entero
			while (entrada.hasNextInt() == false) {
				System.out.println("Entrada incorrecta");
				System.out.println("Vuelve a introducir ");
				entrada.next();
			}
			
			numero = entrada.nextInt();
			System.out.println("Ha ingesado " + numero);
			
			
		
	}

}