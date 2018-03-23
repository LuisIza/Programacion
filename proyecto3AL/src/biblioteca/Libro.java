package biblioteca;
import biblioteca.Autor;

public class Libro {
	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual;
	
	// CONSTRUCTORES

	public Libro (String titulo) {
		this.titulo = titulo;
	}
	public Libro (String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}
	// METODOS
	
		public String toString () {
			return "Datos del Libro"
					+ "\n-------------------------\n"+
					"Titulo: "+titulo+
					"\nISBN: "+ isbn+
					"\nAño del libro: "+ anyoActual + autor.toString();
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
		public Autor getAutor(){
			return autor;
		}
		public void serAutor(Autor autor){
			this .autor = autor;
		}
		
		public  void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public  void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public static void setAnyo(int anyo) {
			Libro.anyoActual = anyo;
		}
	
}
