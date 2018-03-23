//Ordenar raid de 10 elementos
public class Ejemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades[]= {20,18,17,19,25,13,27,4,80};
		int temp;
		int posMin;
		System.out.println("Array actual");
		
		for(int i =0; i<edades.length; i++){
			System.out.println(edades[i]);
		}
		
		for(int i = 0; i<edades.length -1; i++){
			posMin = i;
			
			for(int j = i+1; j<edades.length; j++){
				if(edades[j]< edades[posMin]){
					posMin=j;
				}
			}
			
			temp = edades[i];
			edades[i]= edades[posMin];
			edades[posMin]= temp;
		}
		
		System.out.println("\nArray ordenada");
		for(int i =0; i<edades.length; i++){
			System.out.println(edades[i]);
		}
		

	}

}
