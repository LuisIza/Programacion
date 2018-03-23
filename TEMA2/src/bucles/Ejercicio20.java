package bucles;
/*
 * @author Luis
 */
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

	
			Scanner entrada = new Scanner(System.in);
			
			int numero;
			int i=1;
			do {
				System.out.println("Adivina el numero secreto!! ");
				numero = entrada.nextInt();
				if (numero == 6) {
					System.out.println("Felicidades XD");
					
					break;
				}
				System.out.println("Te queda " + (10-i) + " opurtunidades");
				i++;
			} while (i<=10);
			
			
			if (numero!=6){	
			System.out.println("Has perdido :(");
			}
		
		}

	}
