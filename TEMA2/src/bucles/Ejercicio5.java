package bucles;
import java.util.Scanner;
public class Ejercicio5 {

	//Tabla de Multiplicar de un número ingresado por el usuario


		public static void main(String[] args) {
			
					Scanner entrada = new Scanner(System.in);

					int n1;
					int i = 1;

					System.out.println("Ingrese el número para calcular la tabla");
					n1 = entrada.nextInt();

					while (i <= 10) {
						System.out.print(n1 + " x " + i + " = " + (n1 * i) + "\n");
						i++;
					}


		}

	}
