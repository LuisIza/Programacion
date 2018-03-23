package inicio;
import biblioteca.Autor;
import biblioteca.Libro;
import java.util.*;
public class App {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		//OBJETOS CLASE AUTOR
		Autor autor1 = new Autor("Patrick Rothfuss", "pr@pr.com",1963);

		//OBJETOS CLASE LIBRO
		Autor autores[]= new Autor[1];
		autores[0]= autor1;
		Libro libro1 = new Libro ("El nombre del viento", "80842112",autores);
		
		Autor autoresAnaya[]= new Autor[3];
		autoresAnaya[0]=new Autor ("Pepe Martinez","pmart@gmail.com",1980);
		autoresAnaya[1]=new Autor ("Manuel Sanchez","pms@gmail.com",1970);
		autoresAnaya[2]=new Autor ("Antonio Martinez","amart@gmail.com",1965);
		
		Libro libro2 = new Libro ("Literatura 3º ESO","85621445",autoresAnaya);
		
		// Mostramos autores de los libros
		System.out.println("Autores libro 1:");
		System.out.println(libro1.muestraAutores());
		System.out.println("========================================");
		System.out.println("Autores libro 2:");
		System.out.println(libro2.muestraAutores());
		
		// probamos toString
		System.out.println("Datos libro 1:");
		System.out.println(libro1.toString());
		System.out.println("Datos libro 2:");
		System.out.println(libro2.toString());
		
		//Probamos a introducir datos de libro desde consola
		
		Libro libro3 = new Libro();
		libro3.leerLibro();
		System.out.println(libro3.toString());
		

	}

}
