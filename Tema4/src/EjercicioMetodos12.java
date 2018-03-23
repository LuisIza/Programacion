
import java.util.Scanner;
public class EjercicioMetodos12 {
	
	static Scanner entrada = new Scanner (System.in);
	static int numeros [] =  new int [5];
	
	public static void main(String[] args) {

		ingresar(numeros);
		imprimir(numeros);
	
		System.out.println("\nLista ordenada");
		ordenar(numeros);
		imprimir(numeros);
	}	
	static void ingresar (int numeros[]) {
		System.out.println("Ingresar " + numeros.length + " números");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1));
			numeros[i]= entrada.nextInt();
		}
		System.out.println("");
	}
	static void ordenar (int numeros[]) {
		int posMin=0;
		int temp = 0;
		
		for (int i = 0; i < numeros.length -1; i++) {
			posMin=i;
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[posMin] > numeros[j]) {
					posMin = j;
				}
			}
			temp = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = temp;
		}
	}
	static void imprimir (int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}
	}
}

		