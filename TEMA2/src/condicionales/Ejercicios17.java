/*
 * Autor Luis Iza
 */
package condicionales;
import java.util.*;
public class Ejercicios17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese 2 números para realizar una operación:");
		System.out.println("Número 1: ");
		float num1 = entrada.nextFloat();
		
		System.out.println("Número 2: ");
		float num2 = entrada.nextFloat();
		
		System.out.println("Seleccione la operación a Realiza:");
		System.out.println("\t1) Suma");
		System.out.println("\t2) Resta");
		System.out.println("\t3) Multiplicación");
		System.out.println("\t4) División");
		int opr = entrada.nextInt();
		
		while (opr <1 || opr >4 ){
			System.out.println("Operacion Erronea vuelva a elegir opción");
			opr = entrada.nextInt();
		}
		
		System.out.println("--------------------------------------------");
		
		switch (opr){
		case 1:
			System.out.println("El resultado es = " + (num1+num2));
			break;
		case 2:
			System.out.println("El resultado es = " + (num1-num2));
			break;
		case 3:
			System.out.println("El resultado es = " + (num1*num2));
			break;
		case 4:
			if (num1==0 || num2==0){
			System.out.println("Error de operación");
			}else{
			System.out.println("El resultado es = " + (num1/num2));
			}
			break;
			default:
				System.out.println("Operacion Erronea");
		}
		}

}
