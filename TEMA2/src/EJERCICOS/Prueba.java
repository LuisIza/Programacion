package EJERCICOS;

public class Prueba {

	public static void main(String[] args) {
		int numero;
		int altura=10;
		int i=0;
		for (numero=1;numero<=altura;numero++){
            
			//Este bucle muestra los numeros en cada fila
            for(i=1;i<=numero;i++){
                System.out.print(i);
            }
            //Saltamos de linea
		  System.out.println("");
		} 
	}

}
