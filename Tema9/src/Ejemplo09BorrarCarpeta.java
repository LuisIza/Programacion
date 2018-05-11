import java.io.File;
import java.util.Scanner;

public class Ejemplo09BorrarCarpeta {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("¿Que carpeta quiere borrar?");
		String nombreCarpeta = scan.nextLine();
		
		String ruta = System.getProperty("user.home");
		File carpeta = new File (ruta+"/"+nombreCarpeta);
		carpeta.delete();
	}

}
