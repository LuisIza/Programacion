import java.io.*;

public class Ejemplo06LeerTexto {
	
	private final static String NOMBRE_FILE = "ficheros/archivo1.txt";

	public static void main(String[] args)  {
		
		try {
			FileReader archivo = new FileReader(NOMBRE_FILE);
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea;
			
			while (!eof) {
				linea = buffer.readLine();
				
				if (linea == null) {
					eof=true;
				}else {
					System.out.println(linea);
				}
			}
			
			buffer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		
		

	}

}
