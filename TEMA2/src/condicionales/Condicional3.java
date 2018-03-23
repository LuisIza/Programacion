package condicionales;
import java.util.Scanner;
public class Condicional3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese una Nota \n");
		double nota = entrada.nextDouble();
		
		if (nota >= 5){
			System.out.println("Has aprobado con un " + nota);
			
		}

	}

}
