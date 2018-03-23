package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float compra[] = new float [100];
		int i=0;
		
		System.out.println("Ingresar Precios");
		
		for(i=0 ; i < compra.length; i++ ){
			System.out.println("Precio " + (i+1) +"?");
			compra [i]= entrada.nextFloat();
			
			if (compra[i]==0) {
				break;
			}
			
		}
		System.out.println("===========================");
		System.out.println("Lista de precios ingresados");
		
		i= 0;
		
		while (i < compra.length && compra[i]!= 0){
			System.out.println("Precio " + (i+1) + ": " + compra[i]);
			i++;
		}
		
	}

}
