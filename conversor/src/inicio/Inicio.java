package inicio;
import java.util.*;
import conversion.Conversor;
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Conversor ckm = new Conversor();
		
		System.out.println("Convertir de Kilometros a Millas ");
		System.out.println("Cantidad a convertir");
		double millas = scan.nextDouble();
		System.out.println("Esos KM son: "+ckm.millas(millas)+ " millas");
		
		System.out.println("----------------------------------------------");
		Conversor cat = new Conversor();
		System.out.println("Convertir de milibares a atmósferas");
		System.out.println("Cantidad a convertir");
		double at = scan.nextDouble();
		System.out.println("Son: "+cat.atmosferas(at)+ " atmósferas");
		
		System.out.println("----------------------------------------------");
		Conversor cal = new Conversor();
		System.out.println("Convertir de calorias a julios");
		System.out.println("Cantidad a convertir");
		double caloria = scan.nextDouble();
		System.out.println("Son: "+cal.julios(caloria)+ " julios");
	}

}
