package condicionales;
import java.util.*;
public class Condicionales6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
System.out.println("escribe total compra");
		
		float total = entrada.nextFloat();
		
		if (total >200){
			System.out.println("Tiene un descuento");
		}else{
			System.out.println("Gracios por la compra");
		}

	}

}
