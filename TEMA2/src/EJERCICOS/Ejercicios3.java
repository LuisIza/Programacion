/*
 * @autor Luis
 */
package EJERCICOS;
import java.util.*;
public class Ejercicios3 {

	public static void main(String[] args) {
		
		int exponente=0;
		int base=3;
		double total=0;
		
		do {
			total= Math.pow(base,exponente);
			System.out.println("Base 3 exponete "+ exponente+ " resultado " + total);
			exponente++;
		}while((Math.pow(base,exponente)) < 12000);
	}

}
