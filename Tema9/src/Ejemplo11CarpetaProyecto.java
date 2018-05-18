import java.io.File;

public class Ejemplo11CarpetaProyecto {

	public static void main(String[] args) {
		File  carpeta  = 	new	 File("herramientas/imagenes/configuracion/xml");
		boolean creada  = carpeta.mkdirs();
		if (!creada) {
			System.out.println("no se ha creado");
		}

	}

}
