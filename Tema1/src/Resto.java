import java.util.Scanner;

public class Resto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1;

		System.out.println("Divicion");
		System.out.println("Ingrese un numero");
		n1 = entrada.nextInt();

		System.out.print("Ingresa otro numero ");
		int n2;
		n2 = entrada.nextInt();

		double n3 = n1 % n2;
		System.out.println("el resultado de la divicion es: " + (n1 / n2));
		System.out.println("El resto es: " + n3);

	}

}
