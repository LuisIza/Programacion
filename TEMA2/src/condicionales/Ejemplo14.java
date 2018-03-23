package condicionales;
import java.util.*;
public class Ejemplo14 {
	//menu switch q permite ejecutar opcion elegida
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Elige una opcion\n");
		System.out.println("\t(1) Nuevo Archivo");
		System.out.println("\t(2) Abrir Archivo");
		System.out.println("\t(3) Cerrar Archivo");
		System.out.println("\t(4) Salir");
		System.out.println("Opcion?");
		int opcion= entrada.nextInt();
		
		switch (opcion){
		case 1:
			System.out.println("Se ha creado un nuevo archivo");
			break;
		case 2:
			System.out.println("Abriendo archipo espere por favor...");
			break;
		case 3:
			System.out.println("El archivo se a guardado y cerrado sin problemas");
			break;
		case 4:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opcion no valida");
		}
	}

}
