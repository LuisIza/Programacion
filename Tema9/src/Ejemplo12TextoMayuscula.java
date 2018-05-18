import java.io.*;
import java.lang.reflect.Array;
public class Ejemplo12TextoMayuscula {

	public static void main(String[] args) throws IOException {
		String textos[]= new String [100];
		
		try {
			File origen = new File("ficheros/archivo1.txt");
			
			FileReader arcR = new FileReader(origen);
			BufferedReader arcLeido = new BufferedReader(arcR);
			
			boolean eof = false;
			String linea = "";
			int i = 0;
			while (!eof) {
				linea = arcLeido.readLine();
				i++;
				if (linea == null) {
					eof = true;
				}else {
					textos[i]= linea.toUpperCase();
					
				}
			}
			
			System.out.println(i);
			
			FileWriter arcW = new FileWriter(origen);
			BufferedWriter arcEscrito = new BufferedWriter(arcW);
			
			int contador=0;
			
			while (contador<=i) {
				
				System.out.println(textos[contador]);
				arcEscrito.write(textos[contador]);
				arcEscrito.newLine();
				contador++;
			}
			
			
			arcLeido.close();
			arcEscrito.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
