package algebra;

/**
 * 
 * @author LuisIza
 * 
 */
public class Polinomio {

	private double[] coeficientes;

	/**
	 * Constructor.
	 * 
	 */
	public Polinomio() {
		coeficientes = new double[3];
		
	}

	/**
	 * Constructor por parametro int.
	 * 
	 * @param grado
	 */

	public Polinomio(int grado) {
		coeficientes = new double[grado + 1];
		
	}

	// Metodos

	/**
	 * Constructor por parametro double.
	 * 
	 * @param coefs
	 */
	public Polinomio(double[] coefs) {
		coeficientes = coefs;
	}

	/**
	 * 
	 * @return
	 */
	public int getGrado() {
		return 0;
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public double evaluar(double x) {

		double acumulador = 0;
		for (int i = 0; i < coeficientes.length; i++) {
			
			acumulador = acumulador + coeficientes[i] * (Math.pow(x, i));
			
		}

		return acumulador;
	}

	/**
	 * 
	 * @param p
	 * @return resultado suma de polinomios
	 */
	public Polinomio sumar(Polinomio p) {
		int longMax=Math.max(coeficientes.length, p.coeficientes.length);
		int longMin=Math.min(coeficientes.length, p.coeficientes.length);
		
		double coefSuma[] = new double [longMax];
		
		for (int i = 0; i < longMin; i++) {
			
			coefSuma [i]= coeficientes[i]+p.coeficientes[i];
			
		}
		for (int i = longMin; i < longMax; i++) {
			if (coeficientes.length > p.coeficientes.length){
				coefSuma [i]= coeficientes[i];
			}else{
				
			}
			coefSuma [i]= p.coeficientes[i];
			
		}
		
		Polinomio resultado = new Polinomio (coefSuma);
		return resultado;
	}

	public Polinomio resta(Polinomio p) {
		for(int i=0 ; i<p.coeficientes.length;i++){
			p.coeficientes[i] = -1 * p.coeficientes[i];
		}
		
		return sumar(p);
	}
	

	public String toString() {
		String msg="";
		if (coeficientes[0]<0){
			msg = "- "+ coeficientes[0];
		}else{
		msg = ""+ coeficientes[0];
		}
		
		for (int i = 1; i < coeficientes.length; i++) {
			if (coeficientes[i]>0){
				msg = msg + " + " + coeficientes[i] + "x^" + i;
			}else{
				msg = msg + " - " + (-coeficientes[i]) + "x^" + i;
			}
		}
		return msg;
	}

}
