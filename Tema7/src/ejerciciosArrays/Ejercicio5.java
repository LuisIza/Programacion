package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String nombres[] = new String[5];
		
		System.out.println("Ingrese 5 nombres Array 1?");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese nombre " + (i+1));
			nombres[i]= scan.nextLine();
		}
		
		System.out.println("Ingrese 5 nombres Array 2?");
		String nombres2[] = new String[5];
		
		for (int i = 0; i < nombres2.length; i++) {
			System.out.println("Ingrese nombre " + (i+1));
			nombres2[i]= scan.nextLine();
		}
		
		
			if (Arrays.equals(nombres,nombres2)) {
				System.out.println("Son arrays iguales");
			}else {
			System.out.println("No hay coincidencias");}
		}
	
	

}
