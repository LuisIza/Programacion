package condicionales;
import java.util.Scanner;
public class Condicionales11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del mes\n");
		String mes = entrada.nextLine();
		
		mes = mes.toLowerCase(); //funcion que combierte letras a minusculas
		
								//variable.equals("texto_a_comparar")   compara el texto de la variable 
		
		if (mes.equals("enero") || mes.equals("marzo" )|| mes.equals("Mayo")){
			System.out.println("El mes tiene 31 dias");
		}else if (mes.equals("febrero")){
			System.out.println("El mes de Febrero tiene 28 dias");
		}else if (mes.equals("abril") || mes.equals("junio")){
			System.out.println("El mes tiene 30 dias");
		
		}else{
			System.out.println("NUMERO FUERA DE RANGO");
		}
		

	}

}
