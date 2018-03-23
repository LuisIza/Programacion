package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String matriculas [] = new String [100];
		int i = 0;
		
		for (i=0 ; i < matriculas.length; i++){
			matriculas[i]= "sinmatricula";
		}
		
		i=0;
		for (i=0 ; i < matriculas.length; i++){
			System.out.println("Dato " + (i+1) + ": " + matriculas[i]);
		}

	}

}
