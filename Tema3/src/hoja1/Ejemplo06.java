package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejemplo06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean primo = true;
		
		System.out.println("ingrese un número");
		int candidato = entrada.nextInt();
		
		int i= 1;
		
		while ( i< candidato){
		
		 if (candidato%i == 0){
			 primo= false;
			break;
		 }
		 i++;
		}
		
		
		 if (primo ){
			 System.out.println(" ES PRIMO");
			
		 }else{
			 System.out.println("NO ES PRIMO");
		 }
	}

}
