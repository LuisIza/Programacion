
import java.util.Scanner;
public class EjercicioMetodos10 {
	
	static Scanner entrada = new Scanner (System.in);
	static String meses[]= {"Enero", "Febrero","Marzo","Abril", "Mayo","Junio","Julio", "Agosto","Septiembre",
							"Octubre", "Noviembre","Diciembre"};

	
	public static void main(String[] args) {

		System.out.println("Ingresa el número del mes");
		int mes= entrada.nextInt();
		
		System.out.println(nombreMes(mes));
		
	}	
	
	static String nombreMes (int mes) {
		
		if(mes <1 ||mes >12){
			return "Número fuera de rango";
		
		}
			return	meses[mes-1];
		}
		
	}
	
	


		