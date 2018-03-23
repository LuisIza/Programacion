package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		int primos []= new int[10];
		boolean esPrimo = true;
		int j=2;
		int primo=2;
			 
		for(int i=0;i<primos.length; i++){
			esPrimo = true;
			j=2;
			System.out.println(primo);
			
			while (j<primo ){
				
					if(primo%j==0){
						esPrimo= false;	
						break;
					}
					j++;
				}
				
				
				if (esPrimo){
					primos[i]=primo;
					System.out.println(primos[i]);	
					
				}
				primo++;
				
			
			
		}
		
	
		}

	

}
