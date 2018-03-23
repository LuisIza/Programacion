
import java.util.Scanner;
public class EjercicioMetodos8 {
	
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {

		System.out.println("Ingresa un número");
		int x= entrada.nextInt();
		System.out.println("Ingresa un número");
		int y= entrada.nextInt();
	
		System.out.println("El número mayor es: "+max(x,y));
		System.out.println("El número menor es: "+min(x,y));
	}	
	
	static int max (int x, int y) {
		
		if (x>y) {
			return x;
		}else {
			return y;
		}	
	}
	
	static int min (int x, int y) {
		
		if (x<y) {
			return x;
		}else{
			return y;
		}
	}
}

		