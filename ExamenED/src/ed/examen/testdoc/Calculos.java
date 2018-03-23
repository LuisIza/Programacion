

package ed.examen.testdoc;
import static java.lang.System.*;
import java.math.*;

/**
 * @author LuisIza
 * @version 1.0.0
 * @serial 195.158.258
 * 
 */

public class Calculos {
	
	
	
	/**@return
	 * Metodo recoge 2 números enteros y hace una potencia devolviendo el resultado de la potencia.
	 * @param base: número a elevar.
	 * @param exponente: potencia.
	 * 
	 */
	public static Integer potencia (int base, int exponente) {
		Integer retorno = 1;
		for (int i = 1; i <= exponente; i++) {
			retorno = retorno * base;
		}
		return retorno;
	}
	
	/**@deprecated
	 * Este metodo esta obsoleto y podria desaparecer
	 * 
	 * @param numero: número a realizar el factorial
	 * @return metodo que realiza el factorial de un número ingresado
	 */
	public static int factorial (int numero) {
		int retorno = 1;
		if (numero == 0) {
			return 1;
		}
		
		if (numero <0 ){
			System.out.println("ERROR:" + numero + " entrada no válida");
			retorno = -1;
		}else {
		
		
		for (int i = 0; i <= numero; i++){
			retorno = retorno * numero;
			numero--;
		}
		
		}
		return retorno;
	}
	/*
	public double circunferencia (double radio) {
		return (2 * Math.PI * radio);
	}
	
	public double circulo(double radio) {
		
		//return (Math.PI * potencia (radio,2));
		return (Math.PI * radio * radio);
	}
	*/
	
	/**@return
	 * Se retorna el área de un triangulo teniendo base y altura.
	 * @param base : base del triangulo
	 * @param altura: altura del triangulo
	 * 
	 */
	public static double areaTriangulo (int base, int altura) {
		if (base <0) {
			System.out.println("Error: La base no puede ser negativa");
			return -1;
		}
		
		if (altura <0) {
			System.out.println("Error: Altura no puede ser negativa");
			return -2;
		}
		
		return ((base * altura ) / 2);
	}
}
