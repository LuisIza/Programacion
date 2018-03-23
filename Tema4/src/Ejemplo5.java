/*
 * Ejemplo de paso de parametros por referencia
 */
public class Ejemplo5 {
	public static void main(String[] args) {
		int valores[]= {10,20,30,40,50};
		System.out.println("Antes, el primer valor era "+ valores[0]);
		
		mostrar(valores);
		System.out.println("");
		System.out.println("Despues, el primer valor era "+ valores[0]);
	}
	
	static void mostrar(int val []){
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i]+ " | ");
		}
		val[0]=250;
	}

}
