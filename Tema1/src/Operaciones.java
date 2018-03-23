public class Operaciones {
	// Ejemplos de operaciones aritmetica......
	public static void main(String[] args) {
		double num1 = 120;
		double num2 = 500;

		System.out.println("Multiplica= " + (num1 * num2));
		System.out.println("Suma= " + (num1 + num2));
		System.out.println("Resta= " + (num1 - num2));
		System.out.println("Division = " + (num1 / num2) + " resto= "
				+ (num1 % num2));

		System.out.println("-----------------------------");

		// Ejemplos con operadores Relacionales.............

		int a = 10;
		int b = 15;
		System.out.println("a=b ?" + (a == b));
		System.out.println("a diferente de b ?" + (a != b));
		System.out.println("a menor o igual que b ?" + (a <= b));
		System.out.println("a mayor o igual que b ?" + (a >= b));

		// ejemplo de comparacion de caracteres.....

		System.out.print(" La letra a es menor que la b? " + ('a' < 'b'));
		;

	}

}
