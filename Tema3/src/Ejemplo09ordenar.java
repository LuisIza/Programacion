/*
 * @author Luis
 */


//Ordenar por Metodo de Selección

public class Ejemplo09ordenar {

	public static void main(String[] args) {
		int notas[] = {5,2,6,7,5,1};
		int posMin = 0;
		int aux;	//del tipo de la raid
		for (int i=0; i < notas.length -1; i++)	{	
			
			//posMin guarda el minimo del array
			posMin=i;
			
			//buscamos el elemento mas paqueño desde i hasta el final
			
			for (int j = i+1; j < notas.length; j++) {
				
				// si encomtramos valor minimo cambia el valor de posMin
				if (notas[j]<notas[posMin]){
					posMin=j;
				}
			}
				//intercambiamos el elmento de posicion posMin con el elemento de i
				aux=notas[i];
				notas[i]= notas[posMin];
				notas[posMin]=aux;
				
			}
								
		
		for (int i=0; i < notas.length; i++)	{	
			System.out.println(notas[i]);
			
		}
	}
}
