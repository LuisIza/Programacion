/*
 * @autor Luis
 */
package EJERCICOS;
import java.util.*;
public class Ejercico1 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int i=0;
	int contador = 0;
	System.out.println("Contar multiplos de 5 ");
	
	while (i<1000){
		i=i+5;
		//System.out.println(i);
		contador= contador +i;
		
		}
System.out.println("Total " + contador);
	}

}
