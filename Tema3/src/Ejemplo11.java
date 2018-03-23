/*
 * @author Luis
 */
//leer 6 temperaturas cada dia de la semana
//
import java.util.*;
public class Ejemplo11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float temps[][] = new float[2][6];
		
		System.out.println("Registros metereológicos");
		for (int i = 0; i < temps.length; i++) {
			System.out.println("Dia " + (i+1));
			for (int j = 0; j < temps[0].length; j++) {
				System.out.println("Temperatura " + (j+1) + ": ");
				temps[i][j] = entrada.nextFloat();
			}
		}
		for (int i = 0; i < temps.length; i++) {
			System.out.println("Dia " + (i+1));
			for (int j = 0; j < temps[0].length; j++) {
				System.out.println(temps[i][j]);
			}
			System.out.println("");
		}
	}

}
