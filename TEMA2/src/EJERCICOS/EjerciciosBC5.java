/*
 * Haz un programa que te pida un número y te devuelva su tabla de multiplicar. 
 * Esto se repetirá indefinidamente hasta que el usuario escriba 0. 
 * En ese caso se escribirá la tabla del cero y el programa terminará. 
 * Usa los bucles do-while  y for.
 */

/*
 * @Autor Luis
 */

package EJERCICOS;
import java.util.*;
public class EjerciciosBC5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------Tabla de Multiplicar------");
		
		int num1 = 0;
		int i = 0;
		

		do {
			System.out.println("Ingrese un número ");
			num1 = entrada.nextInt();
			for (i=1; i<= 10; i++){
				System.out.println(num1 +" x " + i + " = " + (num1*i));
			}
			System.out.println("==================\n");
		}while (num1 != 0);
		
		
			
			System.out.println("Fin del programa \n");
				
		 

}
}
