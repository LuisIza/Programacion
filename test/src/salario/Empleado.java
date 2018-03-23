package salario;

import java.util.Scanner;

public class Empleado {

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner (System.in);
		boolean seguir = true;
		//while (seguir){
			
			System.out.println("Ingrese el salario neto");
			
		//}
		
		float s1= CSN(2000f);
		float s2= CSN(1500f);
		float s3= CSN(1499.99f);
		float s4= CSN(1250f);
		float s5= CSN(1000f);
		float s6= CSN(999.99f);
		float s7= CSN(500f);
		float s8= CSN(0);
		float s9= CSN(-1);
		System.out.println("2000\t" +s1);
		System.out.println("1500\t" +s2);
		System.out.println("1499,99\t" +s3);
		System.out.println("1250\t" +s4);
		System.out.println("1000\t" +s5);
		System.out.println("999,99\t" +s6);
		System.out.println("500\t" +s7);
		System.out.println("0\t" +s8);
		System.out.println("-1\t" +s9);
		
		

	}
	
//	public float calculaSalariobruto(TipoEmpleado tipo, float ventaMes, float horasExtra){
//		
//	}
	
	
	public static float CSN (float salarioBruto){
		float salario =salarioBruto;
		if (salarioBruto >= 1000 && salarioBruto <1500){
			salario = salarioBruto*0.84f;
		}else if (salarioBruto >=1500){
			salario = salarioBruto*0.82f;
		}
		
		return salario;
	}

}
