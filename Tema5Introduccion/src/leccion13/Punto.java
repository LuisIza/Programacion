package leccion13;

public class Punto {
	
	// Atributos de la clase
	
	int x;	//Coordenada x del punto (en pixeles)
	int y;	//Coordenada y del punto (en pixeles)
	String color;	//Color del punto
	
	// contructor q tome todos los atibutos
	
	Punto(){
		
	}
	
	Punto (int x, int y, String color){
		this.x=x;
		this.y=y;
		this.color = color;
	}
	

	//Metodos.
	
	void mostrar(){
		System.out.println("El punto tiene coordenadas (" + x + ", " + y + ") y color " + color + ".");
	}
	
	void desplazar (int dx){
		
		x= x+dx;
	}
	
	// Sobrecarga de metodos: 2 metodos desplazar
	
	void desplazas (int dx, int dy){
		x = x+dx;
		y = y+dy;
	}
	
}
