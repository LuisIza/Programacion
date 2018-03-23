import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre;
		int n1;
		int n2;
		int n3;

		System.out.println("¿Como tellamas?");
		nombre = entrada.nextLine();
		System.out.println("Hola, " + nombre);

		System.out.print("Nota 1");
		n1 = entrada.nextInt();

		System.out.print("Nota 2 ");
		n2 = entrada.nextInt();

		System.out.print("Nota 3 ");
		n3 = entrada.nextInt();

		double n4 = (n1 + n2 + n3) / 3;

		System.out.println("Hola " + nombre);
		System.out.println("Tu Nota media es: " + n4);

	}

}
