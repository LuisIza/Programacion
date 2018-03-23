
import java.util.Scanner;
public class EjercicioMetodos1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre;
		int edad;

		System.out.println("Como te llamas?");
		nombre = in.nextLine();

		System.out.println("Cuantos años tienes?");
		edad = in.nextInt();

		datos(nombre, edad);
		in.close();

	}

	static void datos(String nombre, int edad) {
		System.out.println("Hola, " + nombre + ", no parece que tengas" + edad
				+ "años");
	}
}