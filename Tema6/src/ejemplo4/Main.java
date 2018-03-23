package ejemplo4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Escribe el número del dia: ");
	int dia= scan.nextInt();
	
	switch (dia) {
	case DiasSemana.LUNES:
		System.out.println("LUNES");
		break;
	case DiasSemana.MARTES:
		System.out.println("MARTES");
		break;
	}
	
	}

}
