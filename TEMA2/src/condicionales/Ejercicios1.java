/*
 *  Queremos crear una aplicaci�n que controle el acceso 
 *  a un ordenador pidiendo una clave de acceso.
 *  El programa pedir� una cadena de caracteres al usuario. 
 *  La comparar� con la cadena "java8" y si son iguales, escribir� "Acceso permitido". 
 *  En caso contrario escribir� "Acceso denegado". 
 *  Para guardar la clave "java8" utiliza una constante llamada CLAVE_REQUERIDA.
 */

/*
 * @autor Luis
 */
package condicionales;
import java.util.*;
public class Ejercicios1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final String CLAVE_REQUERIDA = "java8";
		
		System.out.println("----CONTROL DE ACCESO----");
		System.out.println("Ingrese su contraseña: \n");
		String contrasenya= entrada.nextLine();
		
		if (contrasenya.equals(CLAVE_REQUERIDA)) {
			System.out.println("Acceso permitido XD");
			
		}else {
			System.out.println("Acceso denegado :C");
			
		}
	}

}
