/*
 * @author Luis
 */

import java.util.*;
public class plantilla {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Ejemplo length()
		System.out.println("Ingresa una palabra");
		String texto=entrada.nextLine();
		System.out.println("Tu frase tiene "+ texto.length() + " letras") ;
		
		int num=texto.length();
		//Ejemplo charAt
		System.out.println("------------------------");
		System.out.println("Texto en vertical");
		System.out.println("------------------------");
		for (int i = 0; i < num; i++) {
			System.out.println(texto.charAt(i));
			
		}
	}

}
