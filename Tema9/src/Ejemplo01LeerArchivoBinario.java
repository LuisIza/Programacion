import java.io.*;
public class Ejemplo01LeerArchivoBinario {

	public static void main (String [] args) {
		
		//Abrimos archivo
		
		try {
			FileInputStream archivo = new FileInputStream("ficheros/archivo1.txt");
			
			
			
			
		}catch (IOException ioe) {
			System.out.println("Error: "+ ioe.toString());
		}
	}
}
