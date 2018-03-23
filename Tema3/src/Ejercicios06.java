/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int votos[] = new int [6];
		String partidos[] = {"PP","PSOE", "CIU", "CUP","PODEM", "TT"};
		int posMin = 0;
		int posMax = 0;
		for(int i=0; i < votos.length; i++){
			System.out.println("Ingrese el número de votos para " + partidos[i]);
			votos[i]= entrada.nextInt();
		}
		
		for(int i=0; i < votos.length; i++){
			if(votos[i]< votos[posMin]){
				posMin=i;
			}
			if(votos[i]> votos[posMin]){
				posMax=i;
			}
		}
	System.out.println("El partido con mas votos es " + partidos[posMax]);
	System.out.println("con: " + votos[posMax] + " Votos");
	System.out.println("Posición " + posMax);
	System.out.println("==============================================");
	System.out.println("El partido con menos votos es " + partidos[posMin]);
	System.out.println("con: " + votos[posMin] + " Votos");
	System.out.println("Posición " + posMin);
	}

}
