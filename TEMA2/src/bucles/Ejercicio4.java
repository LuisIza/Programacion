package bucles;
import java.util.*;
public class Ejercicio4 {
//Escribe una aplicación que pregunte al usuario un número entre 1 y 5. 
//Si responde "3", se le felicitará por haber acertado.
//Si no, se le seguirá pidiendo más números. 
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int NUM = 3;
		System.out.println("Ingrese un Número entre 1-5");
		int i = entrada.nextInt();
		
		
		while (i != NUM){
			System.out.println("Ingrese un Número entre 1-5");
			i = entrada.nextInt();
		}
		System.out.println("Felicidades has acertado...");

	}

}
