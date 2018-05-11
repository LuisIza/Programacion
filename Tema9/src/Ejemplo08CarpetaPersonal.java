import java.io.*;
import java.util.Scanner;

public class Ejemplo08CarpetaPersonal {
		 
	private static String ruta ;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre del archivo?");
		String file = scan.nextLine();
		System.out.println("Ingrese el nombre del jugador?");
		String nombre = scan.nextLine();
		System.out.println("Ingrese la puntuación?");
		int puntos = scan.nextInt();
		
		ruta = System.getProperty("user.home");
		
		
		try {
			File carpeta = new File(ruta+"/Puntuaciones");
			
			if (!carpeta.exists()) {
				boolean resultado = carpeta.mkdir();
				if (!resultado) {
					System.out.println("No se ha creado la carpeta");
					System.exit(0);
				}
				
			}
			
			
			FileWriter archivo = new FileWriter(carpeta +"/"+file,true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.write(nombre);
			buffer.newLine();
			buffer.write(String.valueOf(puntos));
			buffer.newLine();
			buffer.newLine();
			
			buffer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
