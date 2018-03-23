import java.util.Scanner;

public class multiplica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1;

		System.out.println("Ingrese un numero");
		n1 = entrada.nextInt();

		System.out.print("Ingresa otro numero ");
		int n2;
		n2 = entrada.nextInt();

		int n3 = n1 * n2;
		System.out.println("la multiplicacion de los numeros: " + n1 + " * "
				+ n2 + " = " + n3);

	}

}
