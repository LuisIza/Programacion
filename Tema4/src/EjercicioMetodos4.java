
import java.util.Scanner;
public class EjercicioMetodos4 {

	static int numeros []= {2,59,7,8,10,15,3,20};
	
	public static void main(String[] args) {

		ordenar(numeros);

	}

	static void ordenar(int numeros[]) {

		int aux = 0;

		for (int i = 0; i < numeros.length - 1; i++) {
			int posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[posMin] > numeros[j]) {
					posMin = j;
				}
			}

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}