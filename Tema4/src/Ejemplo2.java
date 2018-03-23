import java.util.Scanner;


public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner (System.in);
		System.out.println("Escribe la base: ");
		int num1=entrada.nextInt();
		System.out.println("Escribe el exponente: ");
		int num2=entrada.nextInt();
		
		elevar(num1,num2);

	}
	
	static void elevar2(int base){
		System.out.println(base + " elevado al cuadrado da " + base*base);
		
	}
	
	static void elevar (int base, int exp){
		int total = 1;
		for (int i = 0; i < exp; i++) {
			total = total*base;
			
		}
		System.out.println(base + " elevado a "+exp +" = "+ total);
	}

}
