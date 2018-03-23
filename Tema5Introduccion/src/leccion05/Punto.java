package leccion05;

public class Punto {
	
	// Atributos de la clase
	
	int x;	//Coordenada x del punto (en pixeles)
	int y;	//Coordenada y del punto (en pixeles)
	String color;	//Color del punto
	
	//Metodos.
	
	void mostrar(){
		System.out.println("El punto tiene coordenadas (" + x + ", " + y + ") y color " + color + ".");
	}
	
	void desplazar (int dx){
		
		x= x+dx;
	}
	
	
}
