package Practica01;

public class Video extends Medio {
	
	private String director;
	private String idioma;

	public Video(String nombre, double duracion, String director, String idioma) {
		super(nombre, duracion);
		this.director = director;
		this.idioma = idioma;
	}



	
	public void reproducir() {
		System.out.println("Reproduciendo...");
	}

}
