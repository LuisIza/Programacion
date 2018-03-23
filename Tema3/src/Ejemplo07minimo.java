/*
 * @author Luis
 */

public class Ejemplo07minimo {

	public static void main(String[] args) {
		// encontrar valor minimo
		
		int notas[]= {7,5,10,8 ,3,1};
		int posMin =  0;
		int posMax = 0;
		
		for (int i = 0; i < notas.length; i++) { //ctrl + espacio
			
			if (notas[i]< notas[posMin]){
				posMin=i;
			}
			
			if (notas[i]> notas[posMax]){
				posMax=i;
			}
		}
		
			System.out.println("la posición donde esta el minimo es: "+ posMin);
			System.out.println("El valor mínimo es: " + notas[posMin]);
			System.out.println("la posición donde esta el máximo es: "+ posMax);
			System.out.println("El valor máximo es: " + notas[posMax]);
	}

}
