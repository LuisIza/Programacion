package condicionales;
import java.util.*;
public class Condicionales9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero del mes (1-6)\n");
		int mes = entrada.nextInt();
		
		if (mes== 1){
			System.out.println("El mes de Enero tiene 31 dias");
		}else if (mes == 2){
			System.out.println("El mes de Febrero tiene 28 dias");
		}else if (mes== 3){
			System.out.println("El mes de Marzo tiene 31 dias");
		}else if (mes== 4){
		System.out.println("El mes de Abril tiene 30 dias");
		}else if (mes== 5){
			System.out.println("El mes de Mayo tiene 31 dias");
		}else  if (mes== 6){
			System.out.println("El mes de Junio tiene 30 dias");
		}else{
			System.out.println("NUMERO FUERA DE RANGO");
		}
		

	}

}
