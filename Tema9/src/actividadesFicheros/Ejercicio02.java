package actividadesFicheros;
import java.io.*;
import java.util.*;
/**
 * 
 * @author Luis Iza
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String ruta = System.getProperty("user.home");
		System.out.println("Registro de contactos \n-------------------------------");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Registro " + (i+1)+"\n---------------------------");
			System.out.println("Nombre del contacto?");
			String nombre = scan.nextLine();
			System.out.println("Apellidos del contacto?");
			String apellidos = scan.nextLine();
			System.out.println("Teléfono del contacto?");
			String telefono = scan.nextLine();
			
			try {
				FileWriter archivo = new FileWriter(ruta+"/contactos.txt",true);
				BufferedWriter buffer = new BufferedWriter(archivo);
				
				buffer.write(apellidos+","+nombre+","+telefono);
				buffer.newLine();
				
				buffer.close();
			
			} catch (IOException e) {
				System.out.println("Error Archivo no existe");
				e.printStackTrace();
			}
			
		}	
		System.out.println("Fin del programa");

	}

}
