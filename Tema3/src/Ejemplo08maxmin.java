/*
 * @author Luis
 */


//encuentra el nimo y maximo

public class Ejemplo08maxmin {

	public static void main(String[] args) {
		double pesos[] = {70.4, 76.5, 80, 67, 71, 73};
		int posMin = 0;
		int posMax = 0;
		for (int i = 0; i < pesos.length; i++) {
			if (pesos[i]<pesos[posMin]){
				posMin=i;
			}
			
			if (pesos[i]>pesos[posMax]){
				posMax=i;
			}
			
		}
		
		System.out.println("El peso máximo es: " + pesos[posMax]);
		System.out.println("El peso mínimo es: " + pesos[posMin]);

	}

}
