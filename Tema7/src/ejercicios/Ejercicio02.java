package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		System.out.println("De decima a Binario de 13 \n" + transforma(255) );

	}
	
	private static String transforma (int dato) {
		
		String resultado = "";
		if (dato < 0) {
			return "Error";
		}
		if (dato == 0) {
			resultado = "0";
		}
		
		
		
		while (dato >0) {
			resultado = (dato%2)+resultado  ;
			dato = dato/2;
		}
		return resultado;
	}

}
