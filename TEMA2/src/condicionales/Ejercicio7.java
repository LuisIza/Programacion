package condicionales;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int NS = 5;
		
		System.out.println("----JUEGO DE ADIVINAR EL NUMERO SECRETO----\n");
		System.out.println("\tIngrese un numero\n");
		int numero = entrada.nextInt();
		
		if (numero == NS){
			System.out.println("----FELICIDADES----");			
		}else{
			System.out.println("\t --ERROR--");
		}

	}

}
