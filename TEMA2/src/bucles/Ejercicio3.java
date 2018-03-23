package bucles;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
	        
	        System.out.println("Ingrese un número: ");
	        int numero = entrada.nextInt();
	        
	     
	        while (numero<1 || numero >10) {
	            entrada.nextLine();
	            System.out.print("Ingrese un número: ");
	            numero = entrada.nextInt();
	        }
	        System.out.println("el número ingresado es correcto " +numero);
	    }
	
	}
