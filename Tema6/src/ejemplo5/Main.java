package ejemplo5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		

			System.out.println("Programa para dividir 20 entre un nº");
			System.out.println("Escribe un nº entero: ");
			String numero = entrada.nextLine();

			try {
				int num = Integer.parseInt(numero);
				System.out.println("La división de 20 entre " + num + " es " + 20 / num);

			} catch (NumberFormatException nfe) {
				System.out.println("Tienes que escribir un número entero!!!");
				System.out.println("Error: "+ nfe.getMessage());
				return;
			} catch (ArithmeticException ae) {
				System.out.println("No se puede dividir por cero!!!");
				System.out.println("Error: "+ ae.toString());
				return;
			} catch (Exception e) {
				System.out.println("Error en la lectura del número");
				System.out.println("Error: "+ e.toString());
				return;
			}finally {
				System.out.println("Esta instruccion se ejecuta siempre, "
						+ "tanto si se ha producido una excepcion como si no");
			}
			
			System.out.println("El programa sigue..........");
		
	}

}