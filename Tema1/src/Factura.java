import java.util.Scanner;
/**
 * 
 * @author LuisIza
 *
 */
public class Factura {
/** 
 * @param args
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String producto;

		System.out.println("Ingrese el nombre del producto: ");
		producto = entrada.nextLine();

		System.out.println("Ingrese la cantidad del Producto");
		int cant = entrada.nextInt();

		System.out.println("Ingrese precio");
		float precio = entrada.nextFloat();
/**
 * 
 */
		System.out.println("-------------------------------------------- ");
		System.out.println("              Factura de Compra            ");
		System.out.println("-------------------------------------------- ");
		System.out.println(" Producto \tCantidad \tPrecio");
		System.out.println(" " + producto + "\t \t" + cant + "\t \t" + precio);

		double total = cant * precio;

		System.out.println("-------------------------------------------- ");
		System.out.println("\t" + "\tTotal a pagar: " + total);

	}

}
