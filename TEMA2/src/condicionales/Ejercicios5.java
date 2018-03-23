/*
 * Dise�a una aplicaci�n donde un usuario pueda elegir el idioma de una frase de saludo. 
 * En primer lugar se mostrar� un men�:(1) Franc�s (2) Ingl�s (3) Alem�n (4) Italiano 
 * El usuario escribir� un n�mero entero entre 1 y 4 para se�alar qu� opci�n quiere y, 
 * a continuaci�n, aparecer� la frase "Buenos d�as" en el idioma que corresponda (puedes usar Google translator). 
 * Si escribe otro n�mero, el mensaje se mostrar� en espa�ol. Utiliza la instrucci�n switch. 
 */

/*
 * @autor Luis
 */
package condicionales;
import java.util.*;
public class Ejercicios5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seleccione el idioma a traducir 'Buenos dias'");
		System.out.println("\t1) Francés");
		System.out.println("\t2) Inglés");
		System.out.println("\t3) Alemán");
		System.out.println("\t4) Italiano");
		int opcion=entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Bonjuor");
			break;
		case 2:
			System.out.println("Good Morning");
			break;
		case 3:
			System.out.println("Guten Morgen");
			break;
		case 4:
			System.out.println("Bouna mattina");
			break;
			default:
			System.out.println("Buenos días");
		}

	}

}
