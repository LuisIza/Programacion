package auxiliar;

/**
 * @author LuisIza
 */

import java.util.Scanner;

import auxiliar.Grupo;
public class Alumno {
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	public Alumno (){
		
	}
	
	public Alumno (int numExpediente, String apellidos, String nombre, Grupo grupo){
		this.numExpediente=numExpediente;
		this.apellidos = apellidos;
		this.nombre=nombre;
		this.grupo=grupo;
	}
	
	public String toString (){
		return "NUM EXPEDIENTE | APELLIDOS  |  NOMBRE  "+
				"\n"+numExpediente + "                " + apellidos+ "          "+ nombre+"\n"
				+ grupo+"\n-----------------------------------------------------";
	}
	public void leeDatos(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese los datos del Alumno");
		System.out.println("----------------------------------");
		System.out.print("Num Expediente : ");
		numExpediente = scan.nextInt();
		scan.nextLine();
		System.out.print("Apellidos del alumno: ");
		apellidos = scan.nextLine();
		System.out.print("Nombre del alumno: ");
		nombre = scan.nextLine();
		grupo= new Grupo();
		grupo.leerDatos();
		
		
	}
	
	
	public int getNumExp(){
		return numExpediente;
	}
	
}
