package condicionales;
/*
 * Programa en el que un PIN secreto está guardado en una constante.
 * Se pregunta al usuario un pin y si es correcto permite acceso y si no se le deniega.
 */
import java.util.*;
public class Condicionales7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int PIN = 17;
		
		
		System.out.println("----------BIENVENIDO---------\n");
		
		System.out.println("Para continuar ingrese su PIN: \n");
		float pin2= entrada.nextFloat();
		
		if (PIN == pin2){
			
		System.out.println("-----------------------------\n");
		System.out.println("--------ACCESO PERMITO-------");
		}else{
			System.out.println("-----PIN INCORRECTO----");	
		}

	}

}
