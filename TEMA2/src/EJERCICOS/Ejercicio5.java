/*
 * @autor Luis
 */

package EJERCICOS;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int  num =(int)( Math.random()*10+1);
		System.out.println(num);
		int num2=0;
		int i=0;
		
		do {
			System.out.println("Adivina un número");
			num2= entrada.nextInt();
			i++;
		}while(i<3 && num!=num2);
		
		if (num==num2){
			System.out.println("Has Acertado XD");
		}else{
		System.out.println("Has fallado :C");
		}
		
	}

}
