import java.io.*;
import java.lang.reflect.Array;
public class Ejemplo12TextoMayusculaArray {

	public static void main(String[] args) throws IOException {
		
		
		try {
			File origen = new File("ficheros/archivo1.txt");
			File destino = new File("ficheros/archivo1_copia.txt");
			
			FileReader arcR = new FileReader(origen);
			BufferedReader arcLeido = new BufferedReader(arcR);
			
			FileWriter arcW = new FileWriter(destino);
			BufferedWriter arcEscrito = new BufferedWriter(arcW);
			
			boolean eof = false;
			String linea = "";
			int i = 0;
			while (!eof) {
				linea = arcLeido.readLine();
				i++;
				if (linea == null) {
					eof = true;
				}else {
					
					arcEscrito.write(linea.toUpperCase());
					arcEscrito.newLine();
				}
			}
			
			arcLeido.close();
			arcEscrito.close();
			
			boolean borrado = origen.delete();
			if (borrado) {
				destino.renameTo(origen);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
