package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int potencias []= new int[20];
		int i =0;
		int base = 2;
		
		
		while (i < potencias.length){
			potencias[i] = (int)Math.pow(base, i);
			i++;
		}
		i=0;
		System.out.println("======Potencia del 2======");
		while (i < potencias.length){
			System.out.println("Potencia de  base " + base + " exponente "+ i +" = " + potencias[i]);
			i++;
		}

	}

}
