/*
 * @author Luis
 */
// Ejercicio 14-15

import java.util.*;
public class Ejercicios14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String precios[][]= {
				{"Tablet Samsung", "120"},
				{"Móvil Sony", "115"},
				{"Ipad Mini", "290"},
				{"Móvil HTC", "95"}
				
		};
		float total=0;
		float num=0;
		int posMin =0;
		int posMax =0;
		
		System.out.println("ARTICULOS");
		System.out.println("=============================");
		System.out.println("  PRODUCTO    |    PRECIO (€)");
		System.out.println("-----------------------------");
		
		for (int i = 0; i < precios.length; i++) {
			
				System.out.println(precios[i][0] + "\t " + precios[i][1]);
				
				
					
					if (Float.parseFloat(precios[i][1])< Float.parseFloat(precios[posMin][1])){
						posMin=i;
					}
					if (Float.parseFloat(precios[i][1])> Float.parseFloat(precios[posMin][1])){
						posMax=i;
					}
			
				
				
				num=Float.parseFloat(precios[i][1]);
				total=total+ num;
			}
			
			
		
		System.out.println("\nTotal a pagar: "+total + "€\n");
		System.out.println("Precios máximo es " + precios[posMax][1] + " €");
		System.out.println("Precios mínimo es " + precios[posMin][1] + " €");
		
		

	}

}
