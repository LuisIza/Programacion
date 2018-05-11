import java.io.*;
import java.util.*;
public class Ejemplo10Renombrar {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre del archivo para renombrar?");
		String fileOriginal = scan.nextLine();
		
		System.out.println("Ingrese el nuevo nombre?");
		String fileNuevo = scan.nextLine();
		
		String ruta = System.getProperty("user.home");
		
		File archivoOrigen = new File(ruta+"/"+fileOriginal);
		File archivoDestino = new File(ruta+"/"+fileNuevo);
		
		boolean cambiar = archivoOrigen.renameTo(archivoDestino);
		
		if (cambiar) {
			System.out.println("Archivo renombrado correctamente");
		}else {
			System.out.println("No se ha encontrado el archivo");
		}
		
	}

}
