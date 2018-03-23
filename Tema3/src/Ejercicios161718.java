/*
 * @author Luis
 */

import java.util.*;

public class Ejercicios161718 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String notas [] []= {
				{"Jose Luis Martínez", "7"},
				{"Antonia Ruiz      ", "9"},
				{"Marcos Ramírez    ", "10"	},
				{"Juana Herranz     ","4"},
				{"Alberto López     ", "7"}
		};
		float media=0;
		int posMin = 0; 
		int posMax=0;
		
		System.out.println("\tAlumno         |\tNota");
		System.out.println("=========================================");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i][0]+"\t\t"+ notas[i][1]);
			System.out.println("_______________________________________");
		media = (Float.parseFloat(notas[i][1]))+media;
		
		
		if (Float.parseFloat(notas[i][1])< Float.parseFloat(notas[posMin][1])){
			posMin=i;
		}
		if (Float.parseFloat(notas[i][1])> Float.parseFloat(notas[posMax][1])){
			posMax=i;
		}
		
		}
		
		System.out.println("\nLa nota media del curso es: " + (media/notas.length));
		System.out.println(notas[posMin][0]+ " tiene la nota más baja, un " + notas[posMin][1]);
		System.out.println(notas[posMax][0]+ " tiene la nota más alta, un " + notas[posMax][1]);
	}
}
