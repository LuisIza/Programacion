
public class Ejemplo01Factorial {

	public static void main(String[] args) {
		System.out.println("Fibonaci de 5?:  " + fibonacci(5));
		
	}
	
	/**
	 * Calcula el termino en la posicion n
	 * de la succesion del fibonnaci.
	 * @param n Posición
	 * @return Término n-ésimo de la sucesión.
	 */
	private static int fibonacci (int n) {
		// Si el numero ingresado es nnegativo
		if (n < 0) {
			return -1;
		}
		
		if (n == 0 || n == 1) {
			// Caso base.
			return 1;
		}else {
			//Caso recursivo
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

}


/**
* 	FACTORIAL
* 	0	1	2	3	4	5	6
* 	1	1	2	3	5	8	13
* 
* 	f(2) = f(1) + f(0)
* 	f(3) = f(2) + f(1)
* ............................
* 
* 	f(n) = f(n-1) + f(n-2) 	caso recursivo
* 
* 	f(1) = 1	caso base
* 	f(0) = 1	caso base		
* 
* el método devuelve el valor de la sucesión en la poscicion n.
*
*/
