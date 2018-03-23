/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String notas[][] = new String [3][4] ;
				
		String datos[]= {"Nombre: ", "Exámenes: ", "Trabajos: ","Actitud: "};
		float media;
		
		System.out.println("Introducción de notas");
		System.out.println("========================");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Datos Alumno " + (i+1));
			System.out.println("_______________________");
			for (int j = 0; j < notas[0].length; j++) {
				System.out.println(datos[j]);
				notas[i][j]= entrada.nextLine();
			}
			
		}
		
		System.out.println("\nDatos de evaluación");
		System.out.println("===========================");
		
		for (int i = 0; i < notas.length; i++) {
			media = ((Float.parseFloat(notas[i][1])*50)
					+(Float.parseFloat(notas[i][2])*40)
					+(Float.parseFloat(notas[i][3])*10))/100;
			
			System.out.println(notas[i][0]+": " + media);
			
		}
	}
}
