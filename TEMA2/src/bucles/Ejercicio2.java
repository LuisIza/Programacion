package bucles;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un Carácter \n");
        String caracter = entrada.nextLine();
        System.out.println("Ingrese el numero de veces que quiera que se imprima en pantalla? \n");
        int numero = entrada.nextInt();
        int i=1;
        while (i <=numero) {
            System.out.println(caracter);
            i++;
            
        }
        
    }
}
