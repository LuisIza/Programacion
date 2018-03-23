import java.util.Scanner;

/*
 * @author Luis
 */


public class Ejemplo01 {
//ctrl shiptf O
	public static void main(String[] args) {
		
		mayordomo();
		elevar();
		tabla();
		

	}
	static void mayordomo(){
		System.out.println("¿Qué desea?");
	}
	
	static void elevar(){
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa un número elevar");
		int num = entrada.nextInt();
		System.out.println("Respuesta es: "+ num*num);
		
	}
	static void tabla(){
		for (int i = 1; i < 11; i++) {
			System.out.println(" 5 "+ "* "+ i +" = " + i*5 );
			
		}
	}

}
