import java.io.*;
import java.util.Scanner;

public class Ejemplo07Escribir {
		 
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre del archivo?");
		String file = scan.nextLine();
		System.out.println("Ingrese el nombre del jugador?");
		String nombre = scan.nextLine();
		System.out.println("Ingrese la puntuación?");
		int puntos = scan.nextInt();
		
		
		
		try {
			FileWriter archivo = new FileWriter("ficheros/"+file,true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.newLine();
			buffer.write(nombre);
			buffer.newLine();
			buffer.write(String.valueOf(puntos));
			
			buffer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
