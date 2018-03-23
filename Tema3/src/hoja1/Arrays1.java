package hoja1;
/*
 * @author Luis
 */

public class Arrays1 {

	public static void main(String[] args) {
		//Declarar un array
		float temperaturas[]= {20,22,20,19,17,17,15,15,16};
		
		// los corchetes pueden ir despues del tipo
		float []temperaturas2= {20,22,20,19,17,17,15,15,16};
		
		String [] nombres= {"Alberto" , "Justin", "Santiago", "Tony"};
		
		//Mostramos tamñano de arrays
		System.out.println("El array temperatura tiene " + temperaturas.length + " registros");
		System.out.println("El array nombres tiene " + nombres.length + " registros");
		
		//mostramos valores de arrays
		System.out.println("El primer elemento del arrays temperatura es " + temperaturas[8]);
		System.out.println("El primer elemento y el ultimo de arrasy nombre es: " + nombres[0]+" "+ nombres[3]);
		for (int i=0; i < temperaturas.length; i++ ){
			System.out.println("Registro "+ i +" = "+ temperaturas[i]);
		}
	}

}
