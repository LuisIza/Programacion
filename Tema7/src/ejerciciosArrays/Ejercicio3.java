package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double precios []= {6.30,3.50,4.95,2.90,10,12.30,2.45,4.90,6.20,7};
		Arrays.sort(precios);
		
		
		System.out.println("Ingrese un precio a buscar??");
		double precio = scan.nextDouble();
		
		int pos = Arrays.binarySearch(precios, precio);
		if (pos < 0) {
			System.out.println("No se ha encontrado el elemento");
		} else {
		
		System.out.println("Precio encontrado en la posicion: " + pos);}
		
		System.out.println(Arrays.toString(precios));
	}

}
