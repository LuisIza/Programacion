package bucles;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("--------------TRIVIAL--------------");
		System.out.println("¿Cómo se escribe 30 en Hexadecimal?");
		System.out.println("\t 1) 1E");
		System.out.println("\t 2) 1F");
		System.out.println("\t 3) 33");
		System.out.println("\t 4) Ninguno de los anteriores");
		System.out.println("-----------------------------------\n");
		
		int opcion = entrada.nextInt();
		while (opcion >4 || opcion <1){
			System.out.println("El número ingresado esta fuera de rango (1-4)");
			opcion = entrada.nextInt();
		}
		
		if (opcion == 1){
			System.out.println("Felicidades has Acertado");
		}else{
			System.out.println("Has Fallado :(");
		}
	}

}
