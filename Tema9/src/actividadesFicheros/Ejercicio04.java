package actividadesFicheros;
import java.io.*;
import java.util.*;
/**
 * 
 * @author Luis Iza
 *
 */

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String ruta = System.getProperty("user.home");
		System.out.println("Creación de Mi Web \n-------------------------------");
			System.out.print("Título de la página web: ");
			String titulo = scan.nextLine();
			System.out.print("Encabezado de la web: ");
			String encabezado = scan.nextLine();
			System.out.print("Contenido de la web: ");
			String texto = scan.nextLine();
				
			try {
				FileWriter archivo = new FileWriter(ruta+"/miweb.html");
				BufferedWriter buffer = new BufferedWriter(archivo);
				
				buffer.write("<html>");
				buffer.write("<head>");
				buffer.write("<title>"+titulo+"</title>");
				buffer.write("</head>");
				buffer.write("<body>");
				buffer.write("<h1>"+encabezado+"</h1>");
				buffer.write("<p>"+texto+"</p>");
				buffer.write("</body>");
				buffer.write("</html>");
				buffer.newLine();
				
				buffer.close();
			
			} catch (IOException e) {
				System.out.println("Error Archivo no existe");
				e.printStackTrace();
			}
			System.out.println("Se ha creado la web en tu carpeta personal...");
			
		}	

}
