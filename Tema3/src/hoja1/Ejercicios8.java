package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[]= new double [10];
		int i=0;
		boolean seguir=true;
		
		System.out.println("Ingrese 10 notas ");
		
		do{
			System.out.println("Nota " + (i+1));
			notas[i]= entrada.nextFloat();
			
			if (notas[i]< 0 ){
				seguir= false;
			}
			
			i++;
		}while (seguir && i< notas.length);
		
		
		if (seguir== false){
			System.out.println("Fin del programa");
		
		}else{

			System.out.println("Las notas ingresadas son: \n");
			for (i=0; i<notas.length; i++){
				System.out.println("Nota " + (i+1)+ " = " + notas[i]);
				
			}
		}
			
		

	}

}
