package actividadesFicheros;
import java.io.*;
import java.util.*;
/**
 * 
 * @author Luis Iza
 *
 */

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String ruta = System.getProperty("user.home");
		System.out.println("Abriendo archivo Contactos.... \n-------------------------------");
		
		String etiquetas[]= {"Apellidos: ","Nombre: ", "Teléfono: "};
		
			
			try {
				FileReader archivo = new FileReader(ruta+"/contactos.txt");
				BufferedReader buffer = new BufferedReader(archivo);
				
				boolean eof = false;
				String linea;
				
				
				while (!eof) {
					linea = buffer.readLine();
					
					int contador = 0;
					
					if (linea == null) {
						eof=true;
					}else {
						String textos[]= linea.split(",");
						for  (String lineaTexto : textos) {
							
							System.out.println(etiquetas[contador]+lineaTexto);
							contador++;
						}
						System.out.println("=================================");
					}
	}
				
				buffer.close();
			
			} catch (IOException e) {
				System.out.println("Error Archivo no existe");
				e.printStackTrace();
			}
			
			
			
		}	

}
