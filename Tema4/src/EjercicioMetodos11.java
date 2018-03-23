
import java.util.Scanner;
public class EjercicioMetodos11 {
	
	static Scanner entrada = new Scanner (System.in);
	static String planetas [] =  {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", 
		"Neptuno", "Plutón"};
	
	public static void main(String[] args) {

		
		System.out.println("Ingrese el planeta a buscar?");
		String planeta = entrada.nextLine();
		
		
		System.out.println(buscar(planetas,planeta));
		
	}	
	
	static int buscar (String planetas[], String planeta) {
				
		for (int i = 0; i < planetas.length; i++) {
						
			if (planetas[i].equals(planeta)){
				return i;
			}
			
		}
		return -1;
		
		
	}
	
	
}

		