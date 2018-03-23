/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros []= {8,2,10,20,12,71,15,23};
		int temp = 0;
		int posMin = 0;
		
		System.out.println("     Tabla de números atómicos Original");
		System.out.println("____________________________________________________");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "  |  ");
		}
			
		for (int i = 0; i < numeros.length-1; i++) {
			posMin=i;
			
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[j]< numeros[posMin]){
					posMin=j;
				}
			}
			
			temp= numeros[i];
			numeros[i]= numeros[posMin];
			numeros[posMin]= temp;		
		}
		System.out.println("\n\n");
		System.out.println("     Tabla de números atómicos Ordenada");
		System.out.println("____________________________________________________");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "  |  ");
		}
		

	}

}
