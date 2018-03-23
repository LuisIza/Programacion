public class Operaciones2 {

	public static void main(String[] args) {

		// Ejemplo de Operaciones Logicas......

		boolean a = true;
		boolean b = true;
		boolean c = false;

		// Operador AND
		System.out.println("a y b = " + (a && b));

		// Operador OR
		System.out.println("a o b = " + (a || b));

		// Operador Negacion NOT
		System.out.println("no a = " + (!a));
		System.out.println("-----------------------------");

		// Ejemplos de Orden de Precedencia de los Operadores
		boolean cond1 = 2 < 3 && 7 < 8;
		System.out.println("Condicion1 = " + cond1);

		boolean cond2 = !(5 < 7);
		System.out.println("Condicion2 = " + cond2);

		boolean cond3 = (4 <= 5 || !(5 >= 4)) == false;
		System.out.println("Condicion3 = " + cond3);

	}

}
