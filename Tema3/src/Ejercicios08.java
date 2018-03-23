/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horas[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int temps[] = {45,40,40,40,37,35,39,39,45,50,55,60,65,70,70,75,75,72,65,60,55,50,50,45};
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < temps.length; i++) {
			
			if (temps[i]<temps[posMin]){
				posMin=i;
			}
			if (temps[i]>temps[posMax]){
				posMax=i;
			}
		}
		
		System.out.println("Temperatura mínima es: " +  temps[posMin] + " a las "+horas[posMin] + " horas");
		System.out.println("Temperatura máxima es: " +  temps[posMax] + " a las "+horas[posMax] + " horas");
	}

}

