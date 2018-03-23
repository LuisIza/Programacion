public class SalidaDatos {

	public static void main(String[] args) {

		System.out.print("El lenguaje ");
		System.out.println("Java es de alto nivel.");

		// Ejemplo concatenar

		int alto = 170;
		float peso = 70;
		float imc = 10000 * peso / (alto * alto);
		System.out.println("Tu altura es: " + alto + " cm, y tu peso es: "
				+ peso + "kg");
		System.out.println("Tu indice de masa corporal es: " + imc);

		// Ejemplos de caracteres de control

		System.out.println("salto \n\tde \n\t\tlinea");

		System.out.println("--------------------------------");
		System.out.println("FACTURA");
		System.out.println("--------------------------------");
		System.out.println("COD \tUNID. \tPUND. \tTOTAL \n");
		System.out.println("1010 \t25 \t10 \t250");
		System.out.println("--------------------------------");
		System.out.println("1250 \t5 \t8 \t40");
		System.out.println("\n\"Conctenar\" en unir palabras");
		System.out.println("\'Conctenar\' en unir palabras");
		System.out.println("\nC:\\Users\\Luis\\Documentos");

	}

}
