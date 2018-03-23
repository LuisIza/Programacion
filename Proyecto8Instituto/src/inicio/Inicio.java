package inicio;
import auxiliar.Grupo;
import auxiliar.Alumno;
import instituto.Instituto;
public class Inicio {

	public static void main(String[] args) {
		Grupo g1 = new Grupo (1,"BX",4,"A");
		Grupo g2 = new Grupo (2,"FP",3,"B");
		Grupo g3 = new Grupo (3,"EP",2,"D");
		Grupo g4 = new Grupo (4,"ESO",1,"C");
		Alumno al1 = new Alumno (5,"Sanchez","Diego",g1);
		Alumno al2 = new Alumno (6,"Martinez","Luis",g2);
		Alumno al3 = new Alumno (4,"Albarez","Marco",g3);
		Alumno al4 = new Alumno (2,"Gutierrez","Lucia",g4);
		Instituto alumnos = new Instituto();
		alumnos.addAlumno(al1);
		alumnos.addAlumno(al2);
		alumnos.addAlumno(al3);
		alumnos.addAlumno(al4);
		
		
		for (int i = 0; i < 2; i++) {
		Alumno alu2 = new Alumno();
		alu2.leeDatos();
		alumnos.addAlumno(alu2);
		
		}
		
		alumnos.muestraAlumnos();
		System.out.println("------------------------------------------------------");
		System.out.println("TOTAL ALUMNOS MATRICULADOS: ");
		alumnos.numAlumnos();
		System.out.println("------------------------------------------------------");
		System.out.println("Buscamos alumno con expediente  6 ");
		System.out.println("esta en la posicion " + alumnos.buscaAlumno(6));
		
		System.out.println("Borramos alumno con expediente 6");
		
		alumnos.delAlumno(6);
		
		System.out.println("------------------------------------------------------");
		System.out.println("TOTAL ALUMNOS MATRICULADOS LISTA ACTUALIZADA ");
		alumnos.numAlumnos();
		
		//alumnos.addAlumno(al1);
		
		
		//System.out.println(al1.toString());
		//g1.leerDatos();
		

	}

}
