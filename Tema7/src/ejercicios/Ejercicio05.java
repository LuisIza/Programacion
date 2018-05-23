package ejercicios;

/**
 * 
 * @author Luis Iza
 *
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		System.out.println("Suma recursiva de 5 es:  " + sumRecursiva(5));

	}
	
	private static int sumRecursiva (int n) {
		// Si el numero ingresado es nnegativo
		if (n < 0) {
			return -1;
		}
		// Caso base.
		if (n == 0) {
			return 0;
		}else {
			//Caso recursivo
			return n + sumRecursiva(n-1);
		}
		
	}

}
