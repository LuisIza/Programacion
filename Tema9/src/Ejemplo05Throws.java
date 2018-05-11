import java.io.*;
public class Ejemplo05Throws {
	
	public static void main(String[] args)  {
		
		try {
			leerArchivo();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void leerArchivo() throws IOException {
		
		FileInputStream archivo = new FileInputStream("ficheros/archivo1.txt");
		BufferedInputStream buffer = new BufferedInputStream(archivo);
		boolean eof = false;
		int byteLeido = 0;
		while (!eof) {
			byteLeido=buffer.read();
			if (byteLeido == -1) {
				eof = true;
			}else {
				System.out.println(byteLeido + " ");
			}
		}
		
		buffer.close();
		
		
	}
	
	

}
