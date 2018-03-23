package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String ordenes []= new String [4];
		final String FIN = "ejecutar";
		
		int i = 0;
		System.out.println("Órdenes a seguir?");
		
		for (i=0 ; i < ordenes.length ; i++){
			System.out.println("Ingrese órden " + (i+1) + " ?");
			ordenes[i]= entrada.nextLine();
			if (ordenes[i].equals(FIN)){
				break;
			}
			
		}
		System.out.println("=====================");
		System.out.println("Órdenes a Ejecutar:");
		
		i=0;
		while (i<  ordenes.length && !ordenes[i].equals(FIN)){
		System.out.println("Órden " + (i+1) + " : " + ordenes[i]);
		i++;

	}

}
}
