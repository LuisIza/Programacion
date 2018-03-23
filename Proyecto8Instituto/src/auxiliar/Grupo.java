package auxiliar;
import java.util.*;

public class Grupo {
	private int id;
	private String nivel;
	private int curso;
	private String clase;
	
	
	public Grupo(){
		
	}
	public Grupo (int id, String nivel,int curso, String clase){
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	public String toString(){
		return "ID GRUPO | NIVEL  |  CURSO  |   CLASE"+
				"\n"+id + "          " + nivel+ "         "+ curso + "          "+ clase ;
	}
	public void leerDatos(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese los datos del Grupo");
		System.out.println("----------------------------------");
		System.out.print("ID del grupo: ");
		id = scan.nextInt();
		scan.nextLine();
		System.out.print("Nivel del grupo (EI,EP,ESO,BX,FP): ");
		nivel = scan.nextLine();
	
		System.out.print("Curso del grupo(1,2,3,..): ");
		curso = scan.nextInt();
		scan.nextLine();
		System.out.print("Clase del grupo(A,B,...): ");
		clase = scan.nextLine();
	}

}
