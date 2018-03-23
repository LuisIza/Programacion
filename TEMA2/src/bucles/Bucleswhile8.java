package bucles;
import java.util.Scanner;
/*
 * pedir 5 numero entre 0-10
 * numero q no cumpla condicion volver a pedirlo
 */
public class Bucleswhile8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i=1;//contador notas
		int nota;
		System.out.println("Ingresa 5 notas (1-10)	");	
		while (i <=5){ 
			System.out.println("Ingresa Nota " + i + ":");
			
			//comprovamos que el dato introducido es un entero
			while (entrada.hasNextInt() == false) {
				System.out.println("Entrada incorrecta");
				System.out.println("Vuelve a introducir ");
				entrada.next();
			}
			
			nota = entrada.nextInt();
			
			while (nota <0 || nota >10 ){
				System.out.println("La nota ingresada tiene que estar entre (0-10)");
				System.out.println("Nota " + i + ":");
				while (entrada.hasNextInt() == false) {
					
					System.out.println("Entrada incorrecta 1-10");
					System.out.println("Vuelve a introducir ");
					entrada.next();
				}
				
				nota = entrada.nextInt();
			}
			entrada.nextLine();
			i++;
			
		}
		System.out.println("fin");
		
		
	}

}
		
