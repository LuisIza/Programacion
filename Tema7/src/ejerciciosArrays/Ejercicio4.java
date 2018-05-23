package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int notas []= {5,8,4,9,10,8,2,4};
		
		int primerasNotas []= Arrays.copyOfRange(notas, 0, 4);
		
		System.out.println(Arrays.toString(primerasNotas));
	}

}
