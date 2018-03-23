import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;

		System.out.println("¿Como tellamas?");
		nombre = entrada.nextLine();
		System.out.println("Hola, " + nombre);

		System.out.print("¿Qué edad tienes? ");
		int edad;
		edad = entrada.nextInt();
		System.out.println("\nTe llamas " + nombre + " y tienes " + edad
				+ " años");

	}

}
