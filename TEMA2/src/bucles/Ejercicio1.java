
package bucles;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);

		System.out.println("Ingrese un Carácter \n");
        String caracter = entrada.nextLine();
        int i=1;
        while (i <=100) {
            System.out.println(caracter);
            i++;
            
        }
        
    }
}
