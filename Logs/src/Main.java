import org.apache.log4j.*;

public class Main {

	static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		int num = 8;
		int num2= 23564;
		BasicConfigurator.configure();
		logger.info("Inicio Aplicación");
		Algoritmos alg = new Algoritmos();
		logger.info("Configurando....");
		//System.out.println("es primo el numero " + num + " ? " + Calculos.esPrimo(num));
		
		//System.out.println("Cuenta primos " + Calculos.cuentaPrimos(num));
		
		
		
		//alg.sumaNnaturales();

	}

}
