package condicionales;
import java.util.*;
public class Condicionales13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el dia de la semana 1-7\n");
		int dia = entrada.nextInt();
		
		switch (dia){
		case 1:
			System.out.println(("Lunes"));
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero fuera de rango 1-7");
		}
		
	}

}
