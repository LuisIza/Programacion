package condicionales;
import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del producto: ");
		String producto = entrada.nextLine();

		System.out.println("Ingrese la cantidad del Producto");
		int cantidad = entrada.nextInt();

		System.out.println("Ingrese precio");
		float precio = entrada.nextFloat();

		double total = cantidad * precio;
		double dto = 0;
		int porcentaje;
		String msg;
		if (total >= 200) {
			dto = total * 0.15;
			porcentaje = 15;
			msg = "Su compra a generado un descuento del ";
		} else if (total >= 100) {
			dto = total * 0.1;
			porcentaje = 10;
			msg = "Su compra a generado un descuento del ";

		} else {
			dto = 0;
			porcentaje = 0;
			msg = "Su compra no tiene descuento";
		}

		double totalpagar = total - dto;
		System.out.println("-------------------------------------------- ");
		System.out.println("              Factura de Compra            ");
		System.out.println("-------------------------------------------- ");
		System.out.println(" Producto \tCantidad \tPrecio");
		System.out.println(" " + producto + "\t \t" + cantidad + "\t \t" + precio);

		System.out.println("--------------------------------------------\n ");
		System.out.println(msg + porcentaje + "%");
		System.out.println("\t" + "\tDescuento: \t" + dto+" €");
		System.out.println("\t" + "\tTotal a pagar: " + totalpagar + " €");
	}
}
