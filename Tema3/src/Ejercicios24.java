/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String huecos[][][]= new String [3][3][3];
		int aleatorio = 0;
		int azul=0;
		int rojo=0;
		
		System.out.println("Tres en raya tridimencional");
		for (int i = 0; i < huecos.length; i++) {
			
			for (int j = 0; j < huecos[0].length; j++) {
				
				for (int k = 0; k < huecos[0][0].length; k++) {
					aleatorio = (int) (Math.random()*2 + 1);
					
					if (aleatorio == 1){
						huecos[i][j][k]= "Rojo";
						rojo++;
					}else{
						huecos[i][j][k]= "Azul";
						azul++;
					}
				}
			}
		}
		
		
		
		for (int i = 0; i < huecos.length; i++) {
			
			for (int j = 0; j < huecos[0].length; j++) {
				
				for (int k = 0; k < huecos[0][0].length; k++) {
					System.out.print(huecos[i][j][k]+" \t");	
				}
				System.out.println("");
			}
			System.out.println("_______________________");
		}
		System.out.println("Total de bolas azules " + azul);
		System.out.println("Total de bolas rojas " + rojo);
	}

}

	