
public class Potencia {

	public static void main(String[] args) {
		
		if (args.length != 2){
			System.out.println("Ingresa 2 números");
			System.out.println("Por ejemplo java Potencia 10 4");
		}else{
		
		int base = Integer.parseInt(args[0]);
		int exp = Integer.parseInt(args[1]);
		
		int total = 1;
		for (int i = 0; i < exp; i++) {
			total = total*base;	
		}
		System.out.println(base + " Elevado a "+ exp + " = "+ total);
		
		
		
		}	
	}
	
	

}
