package conversion;

public class Conversor {
	private static final double KM_A_MILLAS = 0.621371;
	private static final double MB_A_ATM = 0.000986923;
	private static final double CAL_A_JULIOS = 4.184;
	
	public Conversor (){
		
	}
	
	public static double millas (double km){	
	return KM_A_MILLAS*km;	
	}
	public static double km (double millas){
	return millas/KM_A_MILLAS;	
	}
	public static double atmosferas (double milibares){
	return MB_A_ATM * milibares ;	
	}
	public static double milibares (double atmosferas){
	return atmosferas/ MB_A_ATM;	
	}
	public static double julios (double calorias){
	return CAL_A_JULIOS*calorias;	
	}
	public static double calorias (double julios){
	return julios/CAL_A_JULIOS;	
	}
	
}