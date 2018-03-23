package condicionales;
import java.util.Scanner;
/*
 * si la nota ingresada es menor que 5 Suspendido y si no Aprobado
 */
public class Condicionales22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingese la Nota ");
		float  nota = entrada.nextFloat();
		
		
		String mensaje  = nota > 5 ? "Aprobado" : "Suspendido";
		
		System.out.println("tu nota es "+ nota + " "+ mensaje);
	}

}
