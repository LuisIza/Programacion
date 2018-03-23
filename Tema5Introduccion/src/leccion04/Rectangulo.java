package leccion04;

public class Rectangulo {
	
	int x,y;	// Posicion del rectangulo (esquina superior izquierda
	int base, altura;	// Dimensiones del rectangulo
	String color;
	int mx,my;	// almacena a donde se ha movido
	
	void mostrar (){
		System.out.println("El rectangulo empieza el las coordenadas (" + x + ", " + y + ").");
		System.out.println("La base y altura es (" + base+ "cm, " + altura+ "cm) y color "+ color + ".");
		
		
	
	
	}
	// crear los metodos area(), perimetro(), mover(dx,dy) y estaDentro (h, v).
	double area(){
		return (base*altura);
	}
	double perimetro(){
		return (base*2 + altura*2);
	}
	
	void mover (int dx, int dy){
		x=x+dx;
		y=y+dy;
	}
	boolean estaDentro(int x0, int y0) {

        // Coordenadas del punto de la esquina izquierda superior.
        int x1 = x;
        int y1 = y;

        // Coordenadas del punto de la esquina derecha inferior.
        int x2 = x + base;
        int y2 = y + altura;
        
        // Comprobación ( debug )
        System.out.println("\nx1,x2 = " + x1 + ","+ x2);
        System.out.println("y1,y2 = " + y1 + "," + y2);

        // Condición: Si h está entre x1 y x2 y v está entre y1 e y2 el punto (h, v)
        // está dentro del rectángulo.

        if ((x0 >= x1 && x0 <= x2) && (y0 >= y1 && y0 <= y2)) {
            return true;

        } else {
            return false;
        }
    }
	
	}
	

