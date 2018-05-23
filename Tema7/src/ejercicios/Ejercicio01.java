package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		System.out.println("De decima a Binario de 13 \n" + transforma(255) );

	}
	
	private static String transforma (int dato) {
		
		if (dato < 0) {
			
			return "Error";
		}
		if (dato == 0) {
			// Valor cero
			return "0";
		}else if (dato == 1) {
			// Caso base
			return "1";
		}else {
			// Caso recursivo
			return  transforma(dato/2)+(dato%2);
		}
	}

}
