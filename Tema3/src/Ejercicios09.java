/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int precios[ ]= {43,58,44,62,80,15,15,10,90,56};
		int tmp;
		int posMin;
		System.out.println("Array actual");
		for (int i = 0; i< precios.length ; i ++){
			System.out.println(precios[i]);
		}
		
		for (int i = 0; i< precios.length -1; i ++){
			posMin= i;
			for(int j= i+1; j<precios.length; j++ ){
				if(precios[j]<precios[posMin]){
					posMin=j;
				}
			}
			
			tmp = precios[i];
			precios[i]= precios[posMin];
			precios[posMin]= tmp;
			
		}
		
		System.out.println("\nArray Ordenada");
		for (int i = 0; i< precios.length ; i ++){
			System.out.println(precios[i]);
		}

	}

}
