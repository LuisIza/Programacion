import java.io.*;
public class Ejemplo01LeerArchivoBinario {

	public static void main (String [] args) {
		
		//Abrimos archivo
		FileInputStream archivo;
		
		try {
			archivo = new FileInputStream("ficheros/archivo1.txt");
			boolean eof = false;
			int byteLeido =0;
			int tamanyo =0;
			
			while (!eof) {
				byteLeido= archivo.read();
				
				if (byteLeido == -1) {
					eof=true;
				}else {
					System.out.print(byteLeido+" ");
					tamanyo++;
				}
		
			}
			System.out.println("\nEl tamaño del archivo es de: "+ tamanyo+ " bytes");
			
			archivo.close();
			
		}catch (IOException ioe) {
			System.out.println("Error: "+ ioe.toString());
		}
	}
}
