package bucles;
/*
 * Programa que muestre las potencias del numero 10
 * menores de 1000000
 */
public class Buclewhile4 {

	public static void main(String[] args) {
		
		 long i = 10L;
		 
		while (i <1000001){
			System.out.println(i);
			i= i*10;
		}
		while (i>1){
			System.out.println(i);
			i = i/10;
		}
		System.out.println("\nFin bucle");
	}

}
