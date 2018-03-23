package EJERCICOS;
import java.util.*;
public class EjercicioFilas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int filas;
		int i=1;
		int j;
		System.out.println("Filas de números");
		
		System.out.println("Cuantas filas quieres?");
		filas= entrada.nextInt();
		while (i<= filas){
			for (j=1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
			i++;
		}

	}

}
