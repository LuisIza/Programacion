import java.util.Scanner;


public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner (System.in);
		
		System.out.println("Escribe la base: ");
		int num1=entrada.nextInt();
		System.out.println("Escribe el exponente: ");
		int num2=entrada.nextInt();
		elevar(num1,num2);
		System.out.println(num1 + " elevado a "+num2 +" = "+ elevar(num1,num2));
		System.out.println(num1 + " elevado a 3 "+elevar3(num1));
		System.out.println(num1 +" base 2 = "+ elevar2(num1));
		
		leer();

	}
	
	static int elevar2 (int base){
		return base*base;
		
	}
	
	static int elevar (int base, int exp){
		int total = 1;
		for (int i = 0; i < exp; i++) {
			total = total*base;	
		}
		return total;
	}
	
	static int elevar3 (int base){
		
		return base*base*base;	
	}
	
	static String leer(){
		Scanner entrada =  new Scanner (System.in);
		System.out.println("ingrese un nombre? ");
		String nombre = entrada.nextLine();
		return nombre;
		
	}

}
