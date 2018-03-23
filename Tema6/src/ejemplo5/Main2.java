package ejemplo5;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		while (true) {

			System.out.println("Programa para dividir 20 entre un nº");
			System.out.println("Escribe un nº entero: ");
			String numero = entrada.nextLine();

			try {
				int num = Integer.parseInt(numero);
				System.out.println("La división de 20 entre " + num + " es " + 20 / num);

			} catch (NumberFormatException | ArithmeticException ae) {
				System.out.println("Tienes que escribir un número que no sea cero!!!");
				System.out.println("Error: "+ ae.getMessage());
			} catch (Exception e) {
				System.out.println("Error en la lectura del número");
				System.out.println("Error: "+ e.toString());
			}
		}
	}

}