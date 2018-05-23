package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		double precios []= {6.30,3.50,4.95,2.90,10,12.30,2.45,4.90,6.20,7};
		Arrays.sort(precios);
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}

	}

}
