/*
 *   Queremos diseñar un programa que solicite un n�mero al usuario 
 *   y le responda "Es impar" o "No es impar". 
 *   Utiliza para ello la notación ? en lugar de if 
 *   asignando a una variable de tipo String el resultado y mostrando despu�s esta variable.
 */

/*
 * @autor Luis
 */
package condicionales;
import java.util.*;
public class Ejercicios3operadorTernario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final String PAR = "No es impar";
		final String IMPAR = "Es impar";
		System.out.println("Ingrese un número: ");
		int num = entrada.nextInt();
		
		String resultado= num%2 !=0? " Es impar": " no es impar";
		System.out.println("El número " + num  + resultado + ".");

	}

}
