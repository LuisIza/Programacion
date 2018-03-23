/*
 * Ejemplo de paso de parametros por valor.
 */
public class Ejemplo4 {

	public static void main(String[] args) {
		int base=10;
		int exp=3;
		System.out.println("Antes base vale " +base); 
		int potencia = elevar(base,exp);
		System.out.println("despues base vale "+base);
		System.out.println("Los tipos primitivos se pasan siempre por valor");

	}
	
	
	static int elevar (int base, int exp){
		
		int total = 1;
		for (int i = 0; i < exp; i++) {
			total = total*base;	
		}
		
		return total;
	}

}
