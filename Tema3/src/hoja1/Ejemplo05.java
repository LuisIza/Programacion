package hoja1;
/*
 * @author Luis
 */

//programa que pregunta temperaturas hasta que el usuario indique que ya no hay mas datos.


import java.util.*;
public class Ejemplo05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float temperaturas [] = new float [100];
		int i=0;
		final int SALIR = 5000;
		
		
		while (i < temperaturas.length){
			System.out.println("Temperatura " + (i + 1)+ "? ");
			temperaturas[i]= entrada.nextFloat();
			
			if (temperaturas [i]== SALIR){
				System.out.println("Fin entrada de datos");
				
				break;
			}
			i++;
		}
		
		i=0;
		System.out.println("=================================");
		System.out.println("TEMPERATURAS ALMACENADAS");
		
		while (i < temperaturas.length && temperaturas[i] != SALIR){
			System.out.println("TEMPERATURA " + i + ": " + temperaturas[i]);
		i++;
		}

	}

}
