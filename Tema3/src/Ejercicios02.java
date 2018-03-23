/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float alturas []= new float[10];
		
		int i;
		boolean stop = false;
		
		for (i=0; i< alturas.length; i++){
			System.out.println("Ingrese estatura " + (i+1) +": ");
			alturas[i]= entrada.nextFloat();
		}
		
		i=0;
		
		for (i=0; i< alturas.length; i++){
			if (alturas[i]>1.9){
				stop=true;
				break;
			}
		}
		
		if (stop){
			System.out.println("altura encontrada mayo a 1.9");
		}else{
			System.out.println("solo hay pequeños");
		}
		
	}

}
