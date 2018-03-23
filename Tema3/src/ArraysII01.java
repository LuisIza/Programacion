/*
 * @author Luis
 */

import java.util.*;
public class ArraysII01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edades[]= {20,25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19};
		boolean edadEncontrada= false;
		
		for(int i=0; i< edades.length ; i++){
			if (edades[i]== 35){
				edadEncontrada= true;
				break;
			}
		}
		if(edadEncontrada = true){
			System.out.println("Edad encontrada");
		}else{
			System.out.println("No se encontro edad");
		}
	}

}
