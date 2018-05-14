package actividadesFicheros;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author LuisIza
 *
 */

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String ruta = System.getProperty("user.home");
		
		System.out.println("Escribre el nombre del archivo a copiar?");
		String nombreArchivo = scan.nextLine();
		
		try {
			FileInputStream entrada = new FileInputStream(ruta+"/"+nombreArchivo);
			BufferedInputStream bufferEntrada = new BufferedInputStream(entrada);
			
			FileOutputStream salida = new FileOutputStream(ruta+"/"+nombreCopia(nombreArchivo));
			BufferedOutputStream bufferSalida = new BufferedOutputStream(salida);
			
			boolean eof = false;
			int byteLeido = 0;
			while (!eof) {
				byteLeido = bufferEntrada.read();
				if (byteLeido == -1) {
					eof=true;
				}else {
					bufferSalida.write(byteLeido);
				}
				}
			
			System.out.println("Archivo copiado...");
			
			bufferEntrada.close();
			bufferSalida.close();
		} catch (IOException e) {
			System.out.println("Error Archivo no existe");
			e.printStackTrace();
		}
		

	}
	
	private static String nombreCopia (String nombre) {
		int posPunto = nombre.lastIndexOf(".");
		String nombreNuevo = nombre.substring(0, posPunto);
		return nombreNuevo+".copia"+nombre.substring(posPunto,nombre.length());
}

}
