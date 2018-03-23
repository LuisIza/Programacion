package condicionales;
import java.util.Scanner;
/*
 * si la compra >100 20% dto si no 5%
 */
public class Condicionales21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingese el valor de la compra: ");
		float compra = entrada.nextFloat();
		
		double compraRebajada = compra < 100 ? compra * 0.95 : compra * 0.8;
		System.out.println("\nCompra Rebajada "+ compraRebajada + "€");
	}

}
