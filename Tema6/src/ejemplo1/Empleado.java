package ejemplo1;

import java.util.Scanner;

public class Empleado extends Persona{
	public Scanner scan = new Scanner (System.in);
	private String numEmpleado;
	
	public Empleado(){
		
	}
	public Empleado(String dni, String nombre, String apellidos,
			String numEmpleado) {
		super(dni, nombre, apellidos);
		this.numEmpleado = numEmpleado;
	}

	public void darDealta(){
		
		System.out.println("Ingrese los datos del Cliente:");
		System.out.println("DNI:");
		dni= scan.nextLine();
		System.out.println("Nombre:");
		nombre = scan.nextLine();
		System.out.println("Apellidos:");
		apellidos = scan.nextLine();
		System.out.println("Num Empleado:");
		numEmpleado= scan.nextLine();
		
		
		
	}
	
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Num empleado: " + numEmpleado);
	}
	
	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
}
