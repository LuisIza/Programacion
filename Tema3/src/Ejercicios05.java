/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperaturas[]= {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		int posMin = 0;
		int posMax = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i]<temperaturas[posMin]){
				posMin=i;
			}
			
			if (temperaturas[i]>temperaturas[posMax]){
				posMax=i;
			}
			
		}
		
		System.out.println("La posición de la temperatura mínima es: " + posMin);
		System.out.println("Temperatura mínima es: " + temperaturas[posMin]);
		System.out.println("============================================");
		System.out.println("La posición de la temperatura máxima es: " + posMax);
		System.out.println("Temperatura máxima es: " + temperaturas[posMax]);
	}

}
