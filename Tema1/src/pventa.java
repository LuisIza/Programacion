import java.util.Scanner;

public class pventa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del producto: ");
		String producto = entrada.nextLine();

		System.out.println("Ingrese el precio del Producto");
		double n2 = entrada.nextDouble();

		System.out.println("Ingrese descuento");
		double n3 = entrada.nextDouble();
		double total = n2 * (1 - (n3 / 100));
		// double total = n2 - (n2*n3/100);

		System.out.println("-------------------------------------------- ");
		System.out.println("              Factura de Compra            ");
		System.out.println("-------------------------------------------- ");
		System.out.println(" Producto \tPrecio \tDescuento");
		System.out.println(" " + producto + "\t \t" + n2 + "\t \t" + n3 + "%");

		System.out.println("-------------------------------------------- ");
		System.out.println("\t" + "\tTotal a pagar: " + total);

	}

}