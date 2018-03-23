package es.calculo;

public class Calculos {
	
	
	public static double division(double  uno, double dos) {
		double retorno = 0;
		if (dos == 0) {
			System.out.println("No se puede Dividir");
			return -1.0;
		}else {
		
		retorno = uno/dos;
		}
		
		return retorno;
	}
	
	public static double areaCirculo (double radio) {
	
		if (radio <= 0) {
			System.out.println("Ingresa un valor mayor que cero");
			return -1;
		}else {
			return Math.PI * radio * radio;
		}
	}
}
