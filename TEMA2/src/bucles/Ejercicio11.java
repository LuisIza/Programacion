package bucles;
import java.util.*;
/*
 * @author Luis
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	float numero=222;
	
	do {
		System.out.println("Ingrese un Número");
		numero = entrada.nextFloat();
	} while (numero < 1 || numero > 20);

	System.out.println("Nota Correcta");

}
}