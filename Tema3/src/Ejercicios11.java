/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edades[]= new int [10];
		int tmp;
		int posMin;
		
		System.out.println("Registro de Edades curso DAW");
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Ingrese la edad " + (i+1));
			edades[i]= entrada.nextInt();
		}
		
		for (int i = 0; i < edades.length -1; i++) {
			posMin=i;
			for (int j = i+1; j < edades.length; j++) {
				if (edades[j]<edades[posMin]) {
					posMin=j;
				}
			}
		tmp = edades[i];
		edades[i]= edades[posMin];
		edades[posMin]= tmp;
		}
		
		System.out.println("\nEdades Ordenadas del curso de DAW");
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
			
		}
		

	}

}
