import java.io.*;
public class Ejemplo04EscribirBuffer {

	public static void main (String [] args) {
		
		//Tiempo inicial
		long tiempoInicial = System.currentTimeMillis();
		escribirArchivo();
		
		//Tiempo final
		long tiempoActual = System.currentTimeMillis();
		System.out.println("Tiempo: "+ (tiempoActual-tiempoInicial) + " milisegundos");
	}

	private static void escribirArchivo() {
		try {
			// archivo de entrada
			FileInputStream entrada = new FileInputStream("ficheros/img.jpg");
			BufferedInputStream bufferEntrada = new BufferedInputStream(entrada);
			
			// archivo de salida
			FileOutputStream salida = new FileOutputStream("ficheros/img_copia.jpg",true);
			BufferedOutputStream bufferSalida = new BufferedOutputStream(salida);
			
			//leer archivo byte a byte
			boolean eof = false;
			int byteLeido=0;
			
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
		
		}catch (IOException e) {
			System.out.println("Error de I/O: " + e.getMessage() );
		}
	}
}