package condicionales;
import java.util.Scanner;
public class Condicionale5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Edad?\n");
		int edad = entrada.nextInt();
		
		if (edad >=18){
			System.out.println("Pedes pasar");
		}else{
			System.out.println("No puedes pasar");
		}
	}

}
