/*
 * 
 */

/*
 * @Autor Luis
 */

package EJERCICOS;
import java.util.*;
public class EjerciciosBC4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------Cálculo Mental------");
		int num1 = 0;
		int num2 = 0;
		int resultado= 0;
		
		while (true){
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);
			
		System.out.println("Suma los siguientes números");
		System.out.println("\t"+num1 + " + "+ num2 );
					
			System.out.println("Total? ");
			resultado = entrada.nextInt();
			
			if(resultado == (num1+num2)){
				System.out.println("Has acertado XD \n");
			}else {
				System.out.println("Has fallado el resultado era " + (num1+num2)+"\n");
			}
			System.out.println("¿Quieres continuar (s/n)?");
			char letra = entrada.next().charAt(0);
			
			if (letra == 's' || letra =='S'){
				
				System.out.println("===========================================\n");
				
			}else{
				System.out.println("Adios, Fin del programa");
				break;
			
			}	
		} 
	


	}

}
