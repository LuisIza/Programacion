import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int alto;
		float peso;

		System.out.println("Por favor Ingresa tu Altura: ");
		alto = entrada.nextInt();

		System.out.println("Ingresa tu peso: ");
		peso = entrada.nextFloat();

		float imc = 10000 * peso / (alto * alto);
		System.out.println("Tu altura es: " + alto + " cm, y tu peso es: "
				+ peso + "kg");
		System.out.println("Tu indice de masa corporal es: " + imc);

	}

}
