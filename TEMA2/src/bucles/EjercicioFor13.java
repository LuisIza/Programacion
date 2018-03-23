package bucles;
/*
 * @author Luis
 */
import java.util.Scanner;

public class EjercicioFor13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Tabla de Multiplicar");
		System.out.println("Ingrese un Número");
		int num=entrada.nextInt();
		
		int i;
		for(i = 0; i<=10; i++){
			System.out.println(num + " x " + i + " = "+ (num*i));
		}
	}

}
