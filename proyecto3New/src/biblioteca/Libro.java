package biblioteca;

import biblioteca.Autor;

import java.util.*;

public class Libro {
	private String titulo;
	private String isbn;
	private Autor autores[];
	private static int anyoActual;
	private Scanner scan = new Scanner(System.in);

	// CONSTRUCTORES
	public Libro() {

	}

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor autores[]) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	// METODOS

	public String toString() {
		if (autores.length > 1) {
			return "Datos del Libro" + "\n-------------------------\n"
					+ "Titulo: " + titulo + "\nISBN: " + isbn + "\n"
					+ "\nEscrito por varios autores";
		} else {
			return "Datos del Libro" + "\n-------------------------\n"
					+ "Titulo: " + titulo + "\nISBN: " + isbn
					+ "\nEscrito por " + autores[0].getNombre();
		}
	}

	public String muestraAutores() {
		String listaAutores = "";
		for (int i = 0; i < autores.length; i++) {
			listaAutores = listaAutores + autores[i].getNombre() + "\n";
		}
		return listaAutores;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getAnyo() {
		return anyoActual;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public static void setAnyo(int anyo) {
		Libro.anyoActual = anyo;
	}

	// pedir varios autores
	public void leerAutores() {

		System.out.println("Cuantos autores tiene el libro?");
		int cantidad = scan.nextInt();
		autores = new Autor[cantidad];
		scan.nextLine();

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Nombre autor");
			String nombre = scan.nextLine();
			System.out.println("Email autor");
			String email = scan.nextLine();
			System.out.println("Año autor");
			int anyo = scan.nextInt();
			scan.nextLine();
			autores[i] = new Autor(nombre, email, anyo);
		}

	}

	public void leerLibro() {

		System.out.println("Introduce los datos del proximo libro:");
		System.out.print("Titulo: ");
		titulo = scan.nextLine();
		System.out.print("ISBN: ");
		isbn = scan.nextLine();
		leerAutores();
	}

}
