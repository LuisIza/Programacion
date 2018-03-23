
import java.util.Scanner;
public class EjercicioMetodos9 {
	
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {

		System.out.println("Ingresa un año");
		int anyo= entrada.nextInt();
		
		System.out.println("El año bisiesto " + bisiesto(anyo));
		
	}	
	
	static boolean bisiesto (int anyo) {
		
		if((anyo %4 == 0) && (anyo % 100 != 0) || (anyo%400 ==0)){
			return true;
		}else{
			return false;
		}
	}
	
	
}

		