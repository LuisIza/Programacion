public class ConvercionesImplicitas {

	public static void main(String[] args) {

		// convertir de byte a short sin problema
		byte n1 = 55;
		short n2 = n1;
		System.out.println(n2);

		// convertir de int a long sin problema
		int a = 20000;
		long b = a;
		System.out.println(b);

		// convertir de int a float sin problema
		float c = a;
		System.out.println(c);

	}

}
