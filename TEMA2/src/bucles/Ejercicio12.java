package bucles;
import java.util.*;
/*
 * @author Luis
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Quién es el autor de la novela "+"Ready Player One?");
		System.out.println("\t1) Douglas Capland");
		System.out.println("\t2) Isaac Asimov");
		System.out.println("\t3) Emest Cline");
		System.out.println("\t4) Ray Bradbury");
		
		int opcion;
		
		do{
			System.out.println("Seleccione una Respuesta");
			opcion = entrada.nextInt();
		}while (opcion <1 || opcion >4);
		
		if (opcion == 3){
		System.out.println("Felicidades ");
		}else{
			System.out.println("Respuesta incorrecta :(");	
		}

	}

}
