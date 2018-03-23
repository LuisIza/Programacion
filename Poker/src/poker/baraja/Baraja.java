package poker.baraja;
import poker.baraja.Carta;
public class Baraja {
	
	private Carta []cartas= new Carta [52];
	
    public Baraja() {
       
    }
    
    public void ordenar() {
    	int contador = 0; // j+13*i-1 en lugar de contador
    	for (int i = 0; i < 4 ; i++) {
			for (int j= 0; j <13 ; j++) {
				cartas[contador]= new Carta(j,i);
				contador++;
			}
		}
    }
    
    public void barajar() {
    	int num1=0;
    	int num2=0;
    	Carta aux;
    	for (int i=0; i<100; i++) {
    		num1 = (int) (Math.random()*52) ;
    		num2 = (int) (Math.random()*52);
    		aux = cartas [num1];
    		cartas [num1]= cartas [num2];
    		cartas [num2]= aux;
    	}
    	
    }
    public void cortar2 () {
    	int corte = (int) (Math.random()*40) ;
    	
    	System.out.println(corte);
    	Carta aux = new Carta();
    	
    	for (int i = 0; i < corte; i++) {
			aux = cartas[0];
    		for (int j = 1; j < cartas.length-1; j++) {
				cartas[j-1]= cartas[j+1];
			}
    		cartas[cartas.length -1]= aux;
		}
    }
    
    public void cortar () {
    	int corte = (int) (Math.random()*40) ;
    	System.out.println(corte);
    	
    	Carta []aux= new Carta [corte];
    	for (int i = 0; i < corte; i++) {
			aux[i]= cartas[i];
		}
    	
    	for (int i = 0; i <cartas.length-corte; i++) {
    			cartas[i]= cartas[i+corte];	
		}
    	
    	for (int i = 0; i < aux.length; i++) {
			cartas[cartas.length - corte +i]= aux[i];
		}	
    }
    
    public void extraer() {
    	System.out.println(cartas[0]);
    }
    public void mostrar () {
    	
    	for (int i = 0; i < 13; i++) {
    		
			System.out.println(i + " " +cartas[i] +"\t"+(i+13) + " " + cartas[i+13] + "\t" +(i+26) + " " + cartas[i+26]+ "\t"+(i+39)  +" "+ cartas[i+39]);
		}
    }
}
