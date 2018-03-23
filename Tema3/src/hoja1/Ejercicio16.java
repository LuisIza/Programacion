package hoja1;
/*
 * @author Luis
 */

import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperaturas []= {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		
		System.out.println("Temperatura media de las ultimas 2 semanas es:");
		int i;
		int j=0;
		double media = 0;
		
		for (i=0; i< temperaturas.length ; i++ ){
			media = temperaturas[i]+ media;
			if (temperaturas[i]>12){
				j++;
			}
			
		}
		System.out.println(media/temperaturas.length + " ºC");
		System.out.println("Estas semanas hemos tenido \n"+ j + " dias con temperaturas superiores a 12ºC");
		
		

	}

}
