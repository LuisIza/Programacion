package condicionales;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del producto: ");
		String producto = entrada.nextLine();

		System.out.println("Ingrese la cantidad del Producto");
		int cant = entrada.nextInt();

		System.out.println("Ingrese precio");
		float precio = entrada.nextFloat();
		
		double total = cant * precio;
		
		double descuento;
		
		if (total >= 75){
			 descuento = (total *15 / 100);
		}else{
			 descuento = (total *5 / 100);
		}
		double preciototal = total - descuento;
		
				
		System.out.println("-------------------------------------------- ");
		System.out.println("              Factura de Compra            ");
		System.out.println("-------------------------------------------- ");
		System.out.println(" Producto \tCantidad \tPrecio");
		System.out.println(" " + producto + "\t \t" + cant + "\t \t" + precio );
		System.out.println("-------------------------------------------- ");
		System.out.println("\t" + "\tDescuento: " + "\t"+ descuento);
		System.out.println("\t" + "\tTotal a pagar: " + preciototal+"€");
		
	}

}
