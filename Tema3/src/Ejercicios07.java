/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String dias[]= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado","Domingo"};
		long audiencias[]= {2000000, 2500000,3100000,3000000, 1200000, 2050000};
		int posMin = 0;
		int posMax = 0;
		for (int i = 0; i < audiencias.length; i++) {
			if (audiencias[i]<audiencias[posMin]) {
				posMin =i;
			}
			if (audiencias[i]>audiencias[posMax]) {
				posMax =i;
			}			
		}
		
		System.out.println("Audiencia máxima es el día " + dias[posMax] + " con "+ audiencias[posMax] + " expectadores");
		System.out.println("Audiencia mínima es el día " + dias[posMin] + " con "+ audiencias[posMin] + " expectadores");
	}

}
