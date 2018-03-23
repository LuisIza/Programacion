/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios13arraybidemencional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		//declaracion array bidimensional de 4 filas por 3 columnas
//		double medidas[][]= new double [4][3];
//		medidas[0][0] = 8.5;
//		medidas[1][0] = 14.2;
//		medidas[2][0] = 11;
//		medidas[3][0] = 7;
//		
//		medidas[0][1] = 1020;
//		medidas[1][1] = 1021;
//		medidas[2][1] = 1022;
//		medidas[3][1] = 1023;
//		
//		medidas[0][2] = 40;
//		medidas[1][2] = 35;
//		medidas[2][2] = 45;
//		medidas[3][2] = 50;
		
		double medidas[][]= {
				{8.5,1020.40},
				{14.2,1021,35},
				{11,1022,45},
				{7,1023,50}
		};
		
		// Mostramos las dimenciones del array.
		System.out.println("La tabla tiene "+medidas.length + " filas" );
		System.out.println("La tabla tiene "+medidas[0].length + " colunmas" );
		
		System.out.println("=======================");
		
		
	}

}
