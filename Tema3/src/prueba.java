/*
 * @author Luis
{1,2,3,1,2,1,}
 */

import java.util.*;
public class prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont=0;
		int numeros[]={1,2,3,1,2,1};
		int k=1;
		
		for (int i = 0; i < numeros.length; i++) {
			
			for (int j = i+1; j < numeros.length; j++) {
				if(numeros[i] == numeros[j]){
					cont ++;
					System.out.println(cont);
				}
			}
			
		}
		
		

	}

}
