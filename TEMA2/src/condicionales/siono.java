package condicionales;

import java.util.Scanner;
public class siono {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese una Nota \n");
		double nota = entrada.nextDouble();
		
		if (nota >= 5){
			System.out.println("Has aprobado con un " + nota);
			
		}else{
			System.out.println("Has suspendido con un " + nota);
		}

	}

}
