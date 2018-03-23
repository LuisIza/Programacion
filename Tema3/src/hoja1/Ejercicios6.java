package hoja1;
/*
 * @author Luis
 */

	import java.util.*;
public class Ejercicios6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float productos []= new float [10];
		System.out.println("Ingrese precio de 10 productos:");
		int i=0;
		while(i< productos.length){
			System.out.println("Precio " + (i+1));
			productos[i]= entrada.nextFloat();
			i++;
		}
		System.out.println("Los precios ingresados son: \n");
		
		for (i=0; i<productos.length; i++){
			System.out.println("Precio " + (i+1)+ " = " + productos[i]);
			
		}
		
		
	}

}
