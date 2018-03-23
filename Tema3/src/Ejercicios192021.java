/*
 * @author Luis
 */

import java.util.*;
public class Ejercicios192021 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nominas[][]= new String [4][3];
		double total = 0;
		int posMin= 0;
				
		System.out.println("Registro de salarios de empleados ");
		
		for (int i = 0; i < nominas.length; i++) {
			System.out.println("------------------------------------");
			System.out.println("Datos del empleado " + (i+1));
			System.out.println("------------------------------------");
			System.out.println("Ingrése el Apellido del empleado");
			nominas[i][0]= entrada.nextLine();
			System.out.println("Ingrése el Nombre del empleado");
			nominas[i][1]= entrada.nextLine();
			System.out.println("Ingrése el sueldo del empleado");
			nominas[i][2]= entrada.nextLine();
			
			total= Double.parseDouble(nominas[i][2])+ total;
		}
		System.out.println("APELLIDOS  |     NOMBRE    |    SUELDO");
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < nominas.length; i++) {
			for (int j = 0; j < nominas[0].length; j++) {
				System.out.print(nominas[i][j]+"     |\t");
			}
			if(Float.parseFloat(nominas[i][2])<Float.parseFloat(nominas[posMin][2])){
				posMin=i;
				
			}
			
			System.out.println("");
		}
		System.out.println("--------------------------------------------");
		System.out.println("Gasto mensual de la empresa es: "+ total+"€");
		System.out.println("El salario mas bajo coresponde al empleado:\n"
				+ nominas[posMin][0]+", "+ nominas[posMin][1] + " " + nominas[posMin][2]+" €");
		
		
	}

}
