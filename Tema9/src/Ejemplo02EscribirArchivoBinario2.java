import java.io.*;
public class Ejemplo02EscribirArchivoBinario2 {

	public static void main (String [] args) {
			
		
		long tiempoInicial = System.currentTimeMillis();
		try {
			// archivo de entrada
			FileInputStream entrada = new FileInputStream("ficheros/img.jpg");
			
			// archivo de salida
			FileOutputStream salida = new FileOutputStream("ficheros/img_copia2.jpg",true);
			
			//leer archivo byte a byte
			boolean eof = false;
			int byteLeido=0;
			
			while (!eof) {
				byteLeido = entrada.read();
				if (byteLeido == -1) {
					eof=true;
				}else {
					salida.write(byteLeido);
				}
			}
			
			System.out.println("Archivo copiado...");
			entrada.close();
			salida.close();
		
		}catch (IOException e) {
			System.out.println("Error de I/O: " + e.getMessage() );
		}
		
		long tiempoActual = System.currentTimeMillis();
		System.out.println("Tiempo: "+ (tiempoActual-tiempoInicial) + " milisegundos");
	}
}
