/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperaturas[][][]= new double [2][2][2];
		
		System.out.println("Registro de temperaturas");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Planta " + (i+1));
			System.out.println("_________________________");
			for (int j = 0; j < temperaturas[0].length; j++) {
				System.out.println("Oficina " + (j+1));
				System.out.println("______________________");
				for (int k = 0; k < temperaturas[0][0].length; k++) {
					System.out.println("Temperatura " + (k+1));
					temperaturas[i][j][k]= entrada.nextDouble();
				}
			}
		}
		System.out.println("Las temperaturas ingresadas son:");
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Planta " + (i+1));
			for (int j = 0; j < temperaturas[0].length; j++) {
				System.out.println("Oficina " + (j+1));
				System.out.println("______________________");
				for (int k = 0; k < temperaturas[0][0].length; k++) {
					System.out.println("Temperatura " + (k+1) +": "+ temperaturas[i][j][k]+" ºC");
					
				}
				System.out.println("");
			}
		}
		
	}

}
