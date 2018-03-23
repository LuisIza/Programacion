package es.calculo;

public class Principal {

	public static void main(String[] args) {
		Calculos division = new Calculos ();
		System.out.println("la division de ... es : " + division.division(2,3));
		System.out.println("la division de ... es : " + division.division(2,0));
		System.out.println("la division de ... es : " + division.division(0,3));
		System.out.println("la division de ... es : " + division.division(0.25,3.2));
		
		System.out.println("Area de l circulo  de radio: " + division.areaCirculo(5));
	}

}
