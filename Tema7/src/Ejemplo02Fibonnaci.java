
public class Ejemplo02Fibonnaci {

	public static void main(String[] args) {
		
		System.out.println("Factorial de 4:  " + factorial(4));
	}
	
	private static int factorial (int n) {
		// Si el numero ingresado es 1
		if (n < 0) {
			return -1;
		}
		
		if (n==0) {
			// Caso base.
			return 1;
		}else {
			//Caso recursivo
			return n * factorial (n-1);
		}
		
	}

}
