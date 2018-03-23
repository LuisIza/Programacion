package cobros;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author jfparedes
 * @version 1.0
 * @serial 2563-4456
 * @since 2005
 * @see Versión On-line de la aplicación
 */
public class cobros2 {

	public static int mon1Ct;
	public static int mon2Ct;
	public static int mon5Ct;
	public static int mon10Ct;
	public static int mon20Ct;
	public static int mon50Ct;
	public static int mon1Eu;
	public static int mon2Eu;
	
	/**
	 * @param args float float
	 * <p>USO: cobros total_factura cobro_cliente</p>  
	 * 
	 * @return lista de monedas a devolver cliente
	 * 
	 * @exception Valores negativos no válidos
	 * 
	 * @throws Excepciones...
	 * @category Negocio TPV
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double recibo = 0.0;
		Double recibido = 0.0;
		Double resultadoCobro = 0.0;
		
		System.out.println ("Inicio el programa");

        String entradaTeclado = "";

        //Creación de un objeto Scanner
        Scanner entradaEscaner = new Scanner (System.in); 
        //Invocamos un método sobre un objeto Scanner

        inicializaMonedas();
        
        System.out.println ("Introduzca el valor del recibo:");
        entradaTeclado = entradaEscaner.nextLine ();
        recibo = Double.parseDouble(entradaTeclado);
        System.out.println ("Total recibo: \"" + recibo +"\"");
        
        System.out.println ("Introduzca la cantidad del cliente:");
        recibido = Double.parseDouble(entradaEscaner.nextLine ());
        System.out.println ("Total recibo: \"" + recibido +"\"");
        
        resultadoCobro = realizarCobro(recibo, recibido);
        System.out.println ("Cantidad a devolver: \"" + resultadoCobro +"\"");
               
        monedasADevolver(75.55);
        imprimeListaMonedas();
               
        System.out.println("Salida del programa");
		
        // Cierro la variable
        entradaEscaner.close();
        
	}
	
	/**
	 * @param recibo
	 * @param recibido
	 * @return
	 */
	public static Double realizarCobro (Double recibo, Double recibido)
	{
		Double resultado = 0.0;
		
		resultado = recibido - recibo; 
		
		return resultado;
	}
	
	private static void monedasADevolver (Double cantidad) {
		Double division = 0.0;
		Integer resto = 0;
		
//		cantidad = cantidad * 100;
	
		out.println("Cantidad: " + cantidad);
		Integer parteEntera = cantidad.intValue();
				
		cantidad = cantidad * 100;
		
		Integer parteDecimal = (cantidad.intValue() - parteEntera*100);
		
		out.println ("Parte entera: " + parteEntera);
		out.println("Parte decimal " + parteDecimal);
		
		// Parte en euros
		
		// moneda de 2€
		division = (double)(parteEntera / 2);
		resto = parteEntera % 2;
		mon2Eu = division.intValue(); // si la división salió mayor a 0
		out.println("Monedas 2 €: " + mon2Eu);
		out.println("Resto: " + resto);
		
		// monedas de 1€
		parteEntera = resto;
		division = (double)(parteEntera / 1);
		resto = parteEntera % 1;
		mon1Eu = division.intValue();
		out.println("Monedas 1 €: " + mon1Eu);
		out.println("Resto: " + resto);

		
		// Parte en decimal
		
		// moneda de 50 cts
		//parteDecimal = resto;
		division = (double)(parteDecimal / 50);
		resto = parteDecimal % 50;
		mon50Ct = division.intValue();
		out.println("Monedas 50 Cts: " + mon50Ct);
		out.println("Resto: " + resto);
		
		// moneda de 20 cts
		parteDecimal = resto;
		division = (double)(parteDecimal / 20);
		resto = parteDecimal % 20;
		mon20Ct = division.intValue();
		out.println("Monedas 20 Cts: " + mon20Ct);
		out.println("Resto: " + resto);
		
		// moneda de 10 cts
		parteDecimal = resto;
		division = (double)(parteDecimal / 10);
		resto = parteDecimal % 10;
		mon10Ct = division.intValue();
		out.println("Monedas 10 Cts: " + mon10Ct);
		out.println("Resto: " + resto);
		
		// moneda de 5 cts
		parteDecimal = resto;
		division = (double)(parteDecimal / 5);
		resto = parteDecimal % 5;
		mon5Ct = division.intValue();
		out.println("Monedas 5 Cts: " + mon5Ct);
		out.println("Resto: " + resto);
		
		// moneda de 2 cts
		parteDecimal = resto;
		division = (double)(parteDecimal / 2);
		resto = parteDecimal % 2;
		mon2Ct = division.intValue();
		out.println("Monedas 5 Cts: " + mon2Ct);
		out.println("Resto: " + resto);
		
		// moneda de 1 cts
		parteDecimal = resto;
		division = (double)(parteDecimal / 1);
		resto = parteDecimal % 1;
		mon1Ct = division.intValue();
		out.println("Monedas 1 Cts: " + mon1Ct);
		out.println("Resto: " + resto);
		
	}

	private static void imprimeListaMonedas () {
		out.println("Resultado de monedas");
		out.println("====================");
		if (mon2Eu != 0)
			out.println ("Moneda 2 €: " + mon2Eu + " | 2 * " + mon2Eu + " = " + 2*mon2Eu);
		if (mon1Eu != 0)
			out.println ("Moneda 1 €: " + mon1Eu + " | 1 * " + mon1Eu + " = " + 1*mon1Eu);
		if (mon50Ct != 0)
			out.println ("Moneda 50 Cts: " + mon50Ct + " | 50 * " + mon50Ct + " = " + 50*mon50Ct);
		if (mon20Ct != 0)
			out.println ("Moneda 20 Cts: " + mon20Ct + " | 20 * " + mon20Ct + " = " + 20*mon20Ct);
		if (mon10Ct != 0)
			out.println ("Moneda 10 Cts: " + mon10Ct + " | 10 * " + mon10Ct + " = " + 10*mon10Ct);
		if (mon5Ct != 0)
			out.println ("Moneda 5 Cts: " + mon5Ct + " | 5 * " + mon5Ct + " = " + 5*mon5Ct);
		if (mon2Ct != 0)
			out.println ("Moneda 2 Cts: " + mon2Ct + " | 2 * " + mon2Ct + " = " + 2*mon2Ct);
		if (mon1Ct != 0)
			out.println ("Moneda 1 Cts: " + mon1Ct + " | 1 * " + mon1Ct + " = " + 1*mon1Ct);
	}
	
	private static  void inicializaMonedas() {
		mon2Eu=0;
		mon1Eu=0;
		mon50Ct=0;
		mon20Ct=0;
		mon10Ct=0;
		mon5Ct=0;
		mon2Ct=0;
		mon1Ct=0;
	}
	
	public int getMon50Ct() {
		return mon50Ct;
	}

	public void setMon50Ct(int mon50Ct) {
		this.mon50Ct = mon50Ct;
	}

	public int getMon1Eu() {
		return mon1Eu;
	}

	public void setMon1Eu(int mon1Eu) {
		this.mon1Eu = mon1Eu;
	}

	public int getMon2Eu() {
		return mon2Eu;
	}

	public void setMon2Eu(int mon2Eu) {
		this.mon2Eu = mon2Eu;
	}

	public int getMon5Ct() {
		return mon5Ct;
	}

	public void setMon5Ct(int mon5Ct) {
		this.mon5Ct = mon5Ct;
	}

	public int getMon1Ct() {
		return mon1Ct;
	}

	public void setMon1Ct(int mon1Ct) {
		this.mon1Ct = mon1Ct;
	}

	public int getMon2Ct() {
		return mon2Ct;
	}

	public void setMon2Ct(int mon2Ct) {
		this.mon2Ct = mon2Ct;
	}

	public int getMon10Ct() {
		return mon10Ct;
	}

	public void setMon10Ct(int mon10Ct) {
		this.mon10Ct = mon10Ct;
	}

	public int getMon20Ct() {
		return mon20Ct;
	}

	public void setMon20Ct(int mon20Ct) {
		this.mon20Ct = mon20Ct;
	}

}