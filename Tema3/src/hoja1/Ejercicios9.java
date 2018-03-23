package hoja1;
/*
 * @author Luis
 */


import java.util.*;
public class Ejercicios9 {

	    public static void main(String[] args) {
	    
	       Scanner entrada = new Scanner(System.in);
	 
	        String test[] = new String[5];
	        int i=0;
	        
	        System.out.println("Escriba una pregunta y sus cuatro respuestas");
	        test[i] = entrada.nextLine();
	        
	        for (i = 1; i < test.length; i++) {
	        	System.out.println("Respuesta " + i);
	            test[i] = entrada.nextLine();
	        }
	        char letra ='a';
	        i = 0;
	        
	        System.out.println(test[i]);
	        
	        for (i = 1; i < test.length; i++) {
	                System.out.println(letra + ") " + test[i]);
	                letra++;       
	        }
	    }
	 
	}
