package bucles;
//Escribe una aplicación que solicite cinco notas. 
//Si el usuario escribe una nota que no está entre 0 y 10 
//se le informará del error y se le volverá a pedir el dato.
import java.util.*;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int i=1;
		int nota1 = 0;	
		int nota2 = 0;
		int nota3 = 0;
		int nota4 = 0;
		int nota5 = 0;
		float media;
		System.out.println("Ingreso de  5 notas");
				
		while (i <=5){ //Contador para las notas
			
			System.out.println("Nota " + i + ":");
			int nota = entrada.nextInt();
			
			while (nota <1 || nota >10 ){
				System.out.println("La nota ingresada tiene que estar entre (1-10)");
				System.out.println("Nota " + i + ":");
				nota = entrada.nextInt();
			}
			
			if (i==1){
				nota1 = nota;
			}else if (i==2){
				nota2 = nota;
			}else if (i==3){
				nota3 = nota;
			}else if (i==4){
				nota4 = nota;
			}else{
				nota5 = nota;
			}
			i++;
			
		}
		media = (nota1 + nota2 + nota3 + nota4 + nota5)/(i-1);
		System.out.println("---------------------------------------");
		System.out.println("-----------BOLETIN DE NOTAS------------");
		System.out.println("Nota 1 \tNota 2 \tNota 3 \tNota 4 \tNota 5");
		System.out.println(nota1 + " \t" + nota2 + " \t" + nota3 + " \t" + nota4 + " \t" + nota5);
		System.out.println("\t \t NOTA MEDIA GENERAL: "+ media);
	}

}
