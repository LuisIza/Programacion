package condicionales;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----------BIENVENIDO---------\n");
		
		System.out.println("Ingrese el numero del mes \n");
		int nmes = entrada.nextInt();
		if (nmes >= 1 && nmes <= 12){
			System.out.println("----------MES CORRECTO---------\n");
		}else{
			//int a=1;
			//if (a==1){
				System.out.println("prueba");
			}
			System.out.println("-----MES NO VALIDO-----");
		}

	}


