package bucles;
/*
 * @author Luis
 */
import java.util.Scanner;

public class Buclesfor10 {
	
	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        
	        while (true){
	        	System.out.println("Que deseas hacer?");
		        System.out.println("1) una suma");
		        System.out.println("2) una resta");
		        System.out.println("3) una multiplicacion");
		        System.out.println("4) una division");

		        int operacion =scan.nextInt();
		        		        
		        while(operacion<1||operacion>4){
		            System.out.println("Operación Incorrecta");
		            operacion = scan.nextInt();
		        }
		        	
		        if(operacion ==0){
		        	break;
		        }
		        
		        System.out.println("Ahora dime un numero:");
		        int num1 = scan.nextInt();
		        System.out.println("Ahora dime otro para hacer la operacion:");
		        int num2 = scan.nextInt();
		            
		        switch(operacion){
		        case 1:
		            System.out.println(num1+num2);
		            break;
		        case 2:
		            System.out.println(num1-num2);
		            break;
		        case 3:
		            System.out.println(num1*num2);
		            break;
		        case 4:
		            if(num2==0){
		                System.out.println("ERROR!! No se puede dividir entre 0...");
		            }else{
		            System.out.println(num1/num2);
		            }
		            break;
		        }
		       
		       
	        }
  
	        
	    }        

	}