/*
 *Añade al programa anterior una comprobación del número introducido, 
 *de manera que si el usuario escribe "1", el programa le responda "No seas tonto" 
 *y vuelva a empezar el bucle, sin mostrar la tabla. 
 *Utiliza la palabra clave continue.
 */

/*
 * @Autor Luis
 */

package EJERCICOS;
import java.util.*;
public class EjerciciosBC6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------Tabla de Multiplicar------");
		
		int num1 = 0;
		int i = 0;
		

		do {
			System.out.println("Ingrese un número ");
			num1 = entrada.nextInt();
			
			if (num1 == 1){
				System.out.println("No seas tonto....");
				continue;
			}else{
			for (i=1; i<= 10; i++){
				System.out.println(num1 +" x " + i + " = " + (num1*i));
			}
			}
			System.out.println("==================\n");
		}while (num1 != 0);
		
		
			
			System.out.println("Fin del programa \n");
				
		 

}
}
