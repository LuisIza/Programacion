package hoja1;
/*
 * @author Luis
 */
public class Ejemplos03 {

	public static void main(String[] args) {
		//array con bucle
		
		float temperaturas[]= {20,22,20,19,17,17,15,15,16};
		
		String [] nombres= {"Alberto" , "Justin", "Santiago", "Tony"};
		
		
		System.out.println("Contenido del array temperaturas");
		for (int i=0; i < temperaturas.length; i++ ){
			System.out.println("Registro "+ i +" = "+ temperaturas[i]);
		}
		System.out.println("\n");
		System.out.println("Contenido del array nombres");
		for (int i=0; i < nombres.length; i++ ){
			System.out.println("Registro "+ i +" = "+ nombres[i]);
		}

	}

}
