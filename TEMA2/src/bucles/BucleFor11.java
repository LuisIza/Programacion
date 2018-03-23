package bucles;
/*
 * @author Luis
 */

/*
 * pedir un número y dividirlo entre -5 , -4 .... hasta 5
 * ejemplo: si ingresa 10 se mostrara:
 * 10 : -5 = -2
 * 10 : -4 =-2,5
 * 
 */
import java.util.Scanner;

public class BucleFor11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un Número: ");
		int num = entrada.nextInt();
		int i=-5;
		float resultado;
		while (i<=5){
			if (i==0){
			
			System.out.println(num + " : "+ i + " = " +"Error");
			i++;
			continue;
			}
			System.out.println(num + " : "+ i+ " = " +(num /i));
			i++;
			
			
		}
	}

}
