package condicionales;
import java.util.Scanner;
public class Condicionales10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero del mes (1-6)\n");
		int mes = entrada.nextInt();
		
		if (mes== 1 || mes==3 || mes == 5){
			System.out.println("El mes tiene 31 dias");
		}else if (mes == 2){
			System.out.println("El mes de Febrero tiene 28 dias");
		}else if (mes==4 || mes == 6){
			System.out.println("El mes tiene 30 dias");
		}else{
			System.out.println("NUMERO FUERA DE RANGO");
		}
		

	}

}
