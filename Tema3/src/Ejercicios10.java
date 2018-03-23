/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperaturas[]= new double [8];
		int posMin;
		double tmp;
		
		System.out.println("Registro de temperaturas");
		
		for (int i=0; i< temperaturas.length; i++){
			System.out.println("Ingrese temperatura "+ (i+1)+ " ?" );
			temperaturas [i] = entrada.nextDouble();	
			
		}
		
		for (int i=0; i< temperaturas.length -1; i++){
			posMin=i;
			for(int j=i+1; j < temperaturas.length;j++){
				
				if (temperaturas[j]<temperaturas[posMin]){
					posMin=j;
				}
			}
			tmp= temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin]=tmp;
			
		}
		
		for (int i=0; i< temperaturas.length; i++){
			System.out.println(temperaturas[i] + " ºC");	
			
		}
		System.out.println("Temperatura máxima es : " + temperaturas[temperaturas.length-1]);
		System.out.println("Temperatura mínima es: " + temperaturas[0]);
		

	}

}
