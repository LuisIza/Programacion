package condicionales;
import java.util.*;
public class Condicionales20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese la altura del Vehículo (m)?\n");
		float altura = entrada.nextFloat();
	
//		String mensaje;
//		
//		if (altura < 2.20 ){
//			mensaje = "Adelante";
//		}else{
//			mensaje = "Prohibido el paso";
//		}
		String mensaje = altura < 2.20? "Adelante": "Prohibido el paso";
		System.out.println(mensaje);
	}

}
