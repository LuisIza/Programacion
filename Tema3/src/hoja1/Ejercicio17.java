package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float precios[] = new float[10];
		int i=0;
		float total = 0;
		int contador=0;
		
		System.out.println("Ingrése el precio de 10 productos");
		
		for(i=0 ; i<precios.length; i++){
			System.out.println("Precio "+ (i+1) + " : ");
			precios[i]= entrada.nextFloat();
			total = total + precios[i];
			
			if(precios[i]>10){
				contador++;
			}
		}
		
		System.out.println("====================================");
		System.out.println("Total a pagar: \t" + total + " €");
		System.out.println("Hay " + contador + " productos mayores que 10€");

	}

}
