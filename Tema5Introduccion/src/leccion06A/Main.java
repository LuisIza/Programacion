package leccion06A;

public class Main {
	public static void main(String[] args) {
		
		Punto c = new Punto();
		c.x=8;
		c.y=8;
		c.color="";
		
		
		Punto a = new Punto(5,8,"rojo");
		a.mostrar();
		
		System.out.println("--------------------");
		
		Punto b = new Punto(8,6,"rojo");
		b.mostrar();
		
	
		
	}

}
