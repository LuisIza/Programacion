package poker.baraja;
import poker.baraja.Baraja;

public class Jugar {
   
    public static void main(String[] args) {
    	 Baraja b = new Baraja();
    	 b.ordenar();
    	 System.out.println("Cartas ordenadas\n--------------------------------------------------------------------------------");
    	 b.mostrar();
    	
//    	 System.out.println("--------------------------------------------------------------------------------\n"
//    	 		+ "Extraer primera carta: ");
//    	 b.extraer();
//    	 
//    	 System.out.println("\n-------------------------------------------------------------------------------\n"
//    	 		+ "Barajando las cartas.................................\n");
//         b.barajar();
//         b.mostrar();
         
        
         System.out.println("\n-------------------------------------------------------------------------------\n"
     	 		+ "Cortando cartas.................................\n");
         b.cortar2();
         b.mostrar();
       
    }
    
}
