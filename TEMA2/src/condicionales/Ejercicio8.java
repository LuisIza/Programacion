package condicionales;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("PALABRAS EN INGLES");
		System.out.println("Como se dice en ingles ordenador?");
		String ingles = entrada.nextLine();
		ingles = ingles.toLowerCase(); //letras en minusculas
		
		if (ingles.equals("computer")){
			System.out.println("Felicidades XD");
		}else{
			System.out.println("Lo siento no es correcta la respuesta :( :(");
		}
	}

}
