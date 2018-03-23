package bucles;
import java.util.*;
/*
 * @author Luis
 */
public class BuclesDowhile9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float nota;

		do {
			System.out.println("Ingrese un Número");
			nota = entrada.nextFloat();
		} while (nota < 0 || nota > 10);

		System.out.println("Nota Correcta");

	}

}
