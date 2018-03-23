package ejemplo5;

import java.util.Scanner;

public class MainEjercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un numero para dividirlo por 15");
		
		String numero = scan.nextLine();
		
		try {
			int num = Integer.parseInt(numero);
			System.out.println(" El resultado es: "+ (15/num));
		}catch (NumberFormatException | ArithmeticException ne){
			System.out.println("Error: introducir un valor numerico "  + ne.getMessage());
			
		}catch (Exception e){
			System.out.println("Error: Valor incorrecto"  + e.getMessage());
			
		}finally {
			System.out.println("Esta instrucción siempre de ejecuta...");
		}
		
		
		
		
		
		
	}

}
