package leccion06B;

public class Circulo {
	//Atributos clase
	int x, y;	//Coordenadas del centro (en pixeles)
	int radio;	//radio del circulo
	String color;
	
	//	// contructor q tome todos los atibutos
	Circulo (int x, int y, int radio, String color){
		this.x=x;
		this.y =y;
		this.radio = radio;
		this.color = color;
	}
	
	// Metodos
	
	void mostrar(){
		System.out.println("Las coordenadas del centro del circulo son (" + x+ ", "+ y + "), radio " + radio+ " y color "+ color + ".");
		
	}
	
	double area(){
		//double pi = Math.PI;
		//double area = pi *(radio*radio);
		//return area;
		return Math.PI * radio *radio;
	}
	
	double perimetro (){
		return 2 * Math.PI * radio;
	}
	
}
