package condicionales;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
				System.out.println("Ingrese una nota: \n");
		
				 if (entrada.hasNextInt() == false ) {
			            System.out.println("La nota tiene que ser un numero entero \n y tiene que estar entre 1-10");
			            System.exit(0);
			            
			        } else {
			        int nota = entrada.nextInt();
			        String msg;
			                
			        if(nota < 5){
			            msg = "Insuficiente";
			        }else if (nota < 6) {
			            msg = "Suficiente";
			        }else if (nota <7) {
			            msg = "Bien";
			        }else if (nota < 8) {
			            msg = "Notable";
			        }else {
			            msg = "Sobresaliente";
			        }
			        System.out.println("\t------------------------------");
			        System.out.println("\t     OBSERVACION        ");
			        System.out.println("\t------------------------------");
			        System.out.println("\tTu nota es: "+ nota + "\t" + msg);
			        System.out.println("\t------------------------------");
			    }
			    }
			}

