package instituto;
import auxiliar.Alumno;
import auxiliar.Grupo;
public class Instituto {
	private int MAX_ALUMNOS = 100;
	
	Alumno []alumnos = new Alumno [MAX_ALUMNOS];
	
	public void addAlumno (Alumno alu){
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]==null){
			alumnos[i] = alu;
			break;
			}
		}
		
	}
	public void delAlumno(int numExp){
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] !=null && alumnos[i].getNumExp()== numExp){
				alumnos[i]= null;
			}
		}
		System.out.println("\n*******Alumno borrado correctamente****************");
	}
	
	public void muestraAlumnos(){
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]!=null){
				System.out.println(alumnos[i]);
			}
		}
		
	}
	public void numAlumnos(){
		int totalAlumnos=0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]!=null){
				totalAlumnos++;
			}
			
		}
		System.out.println(totalAlumnos);
	}
	
	public int buscaAlumno(int num){
		int pos =-1;
	
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] !=null && alumnos[i].getNumExp()== num){
				pos=i;
			}
		}
		return pos;
	}
}
