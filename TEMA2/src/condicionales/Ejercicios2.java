/*
 *  Vamos a perfeccionar la aplicaci�n anterior 
 *  pidiendo un nombre de usuario y una contrase�a para permitir el acceso al ordenador. 
 *  El programa guardar� el nombre de usuario y la contrase�a necesarias 
 *  en las constantes NOMBRE_REQUERIDO, PASSWORD_REQUERIDO. 
 *  Si el nombre de usuario y la contrase�a introducidas coinciden 
 *  con los de estas constantes, aparecer� el mensaje "Acceso permitido".
 *  En caso contrario se escribir� "Acceso denegado".
 */

/*
 * @autor Luis
 */
package condicionales;
import java.util.Scanner;
public class Ejercicios2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final String NOMBRE_REQUERIDO = "LUIS";
		final String PASSWORD_REQUERIDO = "OK87";
		
		System.out.println("----CONTROL DE ACCESO----");
		System.out.println("Ingrese su nombre: \n");
		String nombre= entrada.nextLine();
		
		System.out.println("Ingrese su contraseña: \n");
		String clave= entrada.nextLine();
		
		if (nombre.equals(NOMBRE_REQUERIDO) && clave.equals(PASSWORD_REQUERIDO)) {
			System.out.println("Acceso permitido XD");
			
		}else {
			System.out.println("Acceso denegado :C");
			
		}
	}

}
