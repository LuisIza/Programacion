import java.util.Scanner;

public class Tabla2 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int n1;
		int i = 0;

		System.out.println("Ingrese el numero para calcular la tabla");
		n1 = entrada.nextInt();

		for (i = 0; i <= 10; i++) {
			System.out.print(n1 + " * " + i + " = " + (n1 * i) + "\n");
		}
	}
}
