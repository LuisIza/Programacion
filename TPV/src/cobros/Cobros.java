package cobros;

import java.util.Scanner;

public class Cobros {

	public static void main(String[] args) {
		
		double cliente;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el precio total de la Factura: ");
		double total= scan.nextDouble();
		
		System.out.println("Ingrese cantidad cliente ");
		cliente = scan.nextDouble();
		
		while (cliente<total){
			System.out.println("Cantidad insuficiente volver a ingresar cantidad");
			cliente = scan.nextDouble();
		}
		
		monedasDevolver (cliente-total);

	}
	
	public static void monedasDevolver(double cambio) {
		
		int euros = (int)cambio;
		double numDecimal= (cambio-euros)*100;
		int centimos = (int)numDecimal;
		
		System.out.println("Tu cambio en monedas es " +cambio);
		System.out.println(euros);
		System.out.println(centimos);

		if (euros>=2) {
			int moneda2 = euros/2;
			System.out.println("Tienes " + moneda2 + " monedas de 2€");
			int resto = euros%2;
			if (resto == 1) {
				System.out.println("Tienes una moneda de 1€");
			}		
		}else {
			System.out.println("Tienes una moneda de 1€");
		}
		
		if (centimos >=50) {
			
		}
	}
	
	

}
