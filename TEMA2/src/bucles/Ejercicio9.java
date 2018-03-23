package bucles;
//Escribe un programa que calcule el resto de una división entre enteros 
//con el procedimiento de ir restando repetidamente el divisor del dividendo 
//hasta que el resultado es menor que el divisor
public class Ejercicio9 {

	public static void main(String[] args) {
		
		int dividendo = 27;
		int divisor = 5;
		int resto = dividendo - divisor;
		
		while (resto > divisor){
			System.out.println(dividendo + " - " + divisor + " = " + resto);
			dividendo= resto;
			resto = resto -divisor;
		}
		System.out.println(dividendo + " - " + divisor + " = " + resto);
		System.out.println("Resto: " + resto);
		System.out.println("Fin");

	}

}
