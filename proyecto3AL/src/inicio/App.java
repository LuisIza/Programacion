package inicio;
import biblioteca.Autor;
import biblioteca.Libro;
import java.util.*;
public class App {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		//OBJETOS CLASE AUTOR
		Autor autor1 = new Autor("Patrick Rothfuss", "pr@pr.com",1963);
		Autor autor2 = new Autor ("Dan Brown","db@gmail.com",1964);
		Autor autor3 = new Autor ("J. K. Rowling", "jkr@live.com",1985);
		Autor autor4 = new Autor ("Miguel de Cervantes");
		
		//OBJETOS CLASE LIBRO
		Libro libro1 = new Libro ("El nombre del viento", "80842112",autor1);
		Libro libro2 = new Libro ("Origen","85621445",autor2);
		Libro libro3 = new Libro ("Angeles y demonios", "488554454",autor2);
		Libro libro4 = new Libro ("Harry Potter", "89562314",autor3);
		Libro libro5 = new Libro ("Don quijote", "89556564", autor4);
		// crear un autor en el momento de asignarlo a un libro
		Libro libro6 = new Libro ("La comunidad del anillo", "65324178",new Autor ("JRR Tolkien"));
		
		
		
		
		// Alta autor con datos del usuario
		System.out.println("Ingrese los datos del autor");
		System.out.print("Nombre del autor: ");
		String nombre = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.nextLine();
		System.out.print("Año de nacimiento: ");
		int  anyo = scan.nextInt();
		
		Autor autor5 = new Autor(nombre,email,anyo);
		
		scan.nextLine();
		System.out.print("Titulo del libro: ");
		String titulo = scan.nextLine();
		System.out.print("ISBN del libro: ");
		String isbn = scan.nextLine();
		System.out.print("Año actual: ");
		int  anyolibro = scan.nextInt();
		
		Libro libro7 = new Libro(titulo,isbn,autor5);
		Libro.setAnyo(anyolibro);
		
		
		System.out.println("========================================");
		System.out.println(autor5.toString());
		System.out.println("------------------------------ ");
		System.out.println(libro7.toString());

	}

}
