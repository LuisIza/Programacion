package leccion15;
/*
 * creamos y liberamos mucho espacio
 */
public class Main {
	public static void main(String[] args) {
		
		// Creamos un millón de objetos
		
		for (int i = 0; i < 72000; i++) {
			System.out.println(i);
			Punto a = new Punto(5,8,"rojo");	
		}
		
	
		
	}

}
