package bucles;

// Tabla de multiplicar del 1 al 10 hasta el 10
import java.util.Scanner;

public class Bucleswhile6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 1;
		int n = 0;
		int i = 1;

		while (num <= 10) {
			n= n+2;
			System.out.println("Tabla del "+ num + "\t" + "Tabla del " + n + "\n");
			while (i <= 10) {
				System.out.println(num + " x " + i + " = " + (num * i)  + "\t" +n + " x " + i + " = " + (n * i));
				i++;
			}
			System.out.println("\n");
			num= num + 2;
			i = 1;
		}
	}

}
