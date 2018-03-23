package condicionales;
/*
 * progrma q guarde nuemero entre 1 -10
 * pedir numero y comparar con una constante
 * si acerta ok caso contrario no
 */
import java.util.*;
public class condiconales19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int NUM_SECRETO = 8;
		
		System.out.println("Adivinar un número\n");
		System.out.println("Ingrese el número:\n");
		
		if (entrada.hasNextInt() == false) {
			System.out.println("El dato ingresado es incorrecto (1-10)");
			System.exit(0);
			
		} 
		
		int num = entrada.nextInt();
		if (num == NUM_SECRETO){
			System.out.println("Has Acertado el número es Correcto");
		}else{
		
		System.out.println("Numero incorrecto");
		}
	}

}
