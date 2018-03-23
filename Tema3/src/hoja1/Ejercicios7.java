package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[]= new double [10];
		int i=0;
		
		System.out.println("Ingrese 10 notas ");
		while (i<notas.length){
			System.out.println("Nota " + (i+1));
			notas[i]= entrada.nextFloat();
			i++;
		}
		System.out.println("Los notas ingresadas son: \n");
		
		for (i=0; i<notas.length; i++){
			System.out.println("Nota " + (i+1)+ " = " + notas[i]);
			
		}

	}

}
