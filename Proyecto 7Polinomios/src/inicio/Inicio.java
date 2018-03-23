package inicio;

/**
 * 
 * @author horabaixa
 *
 */

import algebra.Polinomio;

public class Inicio {

	public static void main(String[] args) {
		Polinomio p1 = new Polinomio();
		System.out.println(p1.toString());
		System.out.println("----------------------------------------------------");
		Polinomio p2 = new Polinomio(4);
		System.out.println(p2.toString());
		
		System.out.println("----------------------------------------------------");
		double poli[] = {2,-4,9,9};
		Polinomio p = new Polinomio (poli);
		System.out.println(p.toString());
		double pol2[] = {2,4,9,8};
		Polinomio p3 = new Polinomio (pol2);
		System.out.println(p3.toString());
		
		System.out.println("sumar\n----------------------------");
		System.out.println(p3.sumar(p).toString());
		
		System.out.println(p.toString());
		System.out.println("Evaluar : " + p.evaluar(2));
	}

}
