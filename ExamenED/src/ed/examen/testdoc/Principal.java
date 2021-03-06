package ed.examen.testdoc;

import static java.lang.System.out;

/**
 * @author LuisIza
 * @version 1.0.0
 * @serial 195.158.258
 *
 * Clase principal que llama a metodos para realizar
 * distintas funciones (Potencia,Factorial,área).
 *
 */

public class Principal {

	private static Calculos calculos = new Calculos();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**@see
		 * Llama al metodo potencia
		 */
		out.println ("Calculo de la potencia: " + calculos.potencia(2, -3));
		/**@see
		 * Llama al metodo factorial 
		 * Este metodo es obsoleto
		 */
		out.println ("Calculo de factorial: " + calculos.factorial(5));
		/**@see
		 * Llama al metodo para calcular el área del triangulo.
		 */
		out.println ("Calcula área triangulo: " + calculos.areaTriangulo(0, 3));

	}

}
