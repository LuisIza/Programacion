package leccion10;

public class Rectangulo {
	
	private int x,y;	// Posicion del rectangulo (esquina superior izquierda
	private int base, altura;	// Dimensiones del rectangulo
	
	// color de variable estatica, todos los objetos van a tener el mismo color
	private static String color;
	private static int cantidadRectangulos=0;

	
	// CONSTRUCTOR.
	public Rectangulo(){
		cantidadRectangulos++;
		
	}
	
	public Rectangulo(int x, int y, int base, int altura, String color){
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
		cantidadRectangulos++;
		
	}
	
	public Rectangulo(int x, int y){
		this(x,y,100,100,"negro");
	}

	// METODOS
	
	public void mostrar (){
		System.out.println("El rectangulo empieza el las coordenadas (" + x + ", " + y + ").");
		System.out.println("La base y altura es (" + base+ "cm, " + altura+ "cm) y color "+ color + ".");

	}
	// crear los metodos area(), perimetro(), mover(dx,dy) y estaDentro (h, v).
	public double area(){
		return (base*altura);
	}
	public double perimetro(){
		return (base*2 + altura*2);
	}
	
	public void mover (int dx, int dy){
		x=x+dx;
		y=y+dy;
	}
	public boolean estaDentro(int x0, int y0) {

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
	// METODOS DE ACCESO
	// METODO GET
	public int getX (){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getBase(){
		return base;
	}
	public int getAltura(){
		return altura;
	}
	public String getColor(){
		return color;
	}
	public int getContar(){
		return cantidadRectangulos;
	}
	
	// METODO SET
	public void setX(int x){
		this.x= x;
	}
	public void setY(int y){
		this.y = y;	
	}
	public void setBase(int base){
		this.base=base;
	}
	public void setAltura (int altura){
		this.altura=altura;
	}
	public void setColor (String color){
		this.color = color;
	}
	
	
	}
	

