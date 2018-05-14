package actividadesFicheros;
import java.io.*;
import java.util.*;
/**
 * 
 * @author Luis Iza
 *
 */

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String ruta = System.getProperty("user.dir");
		System.out.println("Contar CASE y BREAK \n============================");
		
		System.out.println("Escriba el nombre del archivo? ");
		String archivoJava = scan.nextLine();
		
			
			try {
				FileReader archivo = new FileReader(ruta+"/src/"+archivoJava);
				BufferedReader buffer = new BufferedReader(archivo);
				
				boolean eof = false;
				String linea;
				boolean cases = false;
				boolean breakss= false;
				String textoCase = "case";
				String textoBreak = "break";
				
				int contadorCases = 0;
				int contadorBreaks = 0;
				
				while (!eof) {
					linea = buffer.readLine();
					String linea2= linea;
										
					if (linea == null) {
						eof=true;
					}else {
						
						while (linea.indexOf(textoCase)>-1) {
							linea = linea.substring(linea.indexOf(textoCase)+textoCase.length(),linea.length());
							contadorCases++;
						}

						while (linea2.indexOf(textoBreak)>-1) {
							linea2 = linea2.substring(linea2.indexOf(textoBreak)+textoBreak.length(),linea2.length());
							contadorBreaks++;
						}
					
					}
				}
				if (contadorBreaks<contadorCases){
					System.out.println("El programa contiene: \n"
							+ contadorCases + " CASE -- "+ contadorBreaks + " BREAK");
					System.out.println("El programa podria tener algun fallo por falta de Break..");
				}else {
					System.out.println("El programa contiene: \n"
				+ contadorCases + " CASE -- "+ contadorBreaks + " BREAK");
				}
				
				buffer.close();
			
			} catch (IOException e) {
				System.out.println("Error Archivo no existe");
				e.printStackTrace();
			}
			
		}	

}
